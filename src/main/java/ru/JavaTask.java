package ru;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaTask {
    // реализация с использованием стримов
    public static Map<Integer, Integer> getCountMapWithStreamApi(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        return numbers
                .stream()
                .collect(Collectors.toMap(Function.identity(), x -> 1, Integer::sum));
    }

    // реализация с использованием циклов
    public static Map<Integer, Integer> getCountMapWithForLoop(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer number : numbers) {
            result.compute(number, (k, v) -> v == null ? 1 : v + 1);
        }
        return result;
    }
}
