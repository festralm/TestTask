package ru;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaTaskTest {
    @Test
    public void getCountMapWithStreamApi_givenNull_expectedEmpty() {
        // given
        List<Integer> givenNumbers = null;

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithStreamApi(givenNumbers);

        // then
        assertThat(actualMap).isNull();
    }

    @Test
    public void getCountMapWithStreamApi_givenOneNumber_expectedOneSizeMap() {
        // given
        List<Integer> givenNumbers = List.of(1);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 1);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithStreamApi(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithStreamApi_givenNumSameNumberFiveTimes_expectedOneSizeMap() {
        // given
        List<Integer> givenNumbers = List.of(1, 1, 1, 1, 1);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 5);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithStreamApi(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithStreamApi_givenTwoNumbers_expectedTwoSizeMap() {
        // given
        List<Integer> givenNumbers = List.of(1, 2);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 1);
        expectedMap.put(2, 1);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithStreamApi(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithStreamApi_givenDifferentNumbers_expectedMapValuesEqualOne() {
        // given
        List<Integer> givenNumbers = List.of(1, 3, 4, 2, 5, 10, 10_000);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 1);
        expectedMap.put(3, 1);
        expectedMap.put(4, 1);
        expectedMap.put(2, 1);
        expectedMap.put(5, 1);
        expectedMap.put(10, 1);
        expectedMap.put(10_000, 1);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithStreamApi(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithStreamApi_givenDifferentRepeatingNumbers_expectedMap() {
        // given
        List<Integer> givenNumbers = List.of(1, 3, 4, 2, 5, 10, 10_000, 1, 1, 2, 1, 3, 10_000, 2, 10_000);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 4);
        expectedMap.put(3, 2);
        expectedMap.put(4, 1);
        expectedMap.put(2, 3);
        expectedMap.put(5, 1);
        expectedMap.put(10, 1);
        expectedMap.put(10_000, 3);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithStreamApi(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithForLoop_givenNull_expectedEmpty() {
        // given
        List<Integer> givenNumbers = null;

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithForLoop(givenNumbers);

        // then
        assertThat(actualMap).isNull();
    }

    @Test
    public void getCountMapWithForLoop_givenOneNumber_expectedOneSizeMap() {
        // given
        List<Integer> givenNumbers = List.of(1);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 1);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithForLoop(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithForLoop_givenNumSameNumberFiveTimes_expectedOneSizeMap() {
        // given
        List<Integer> givenNumbers = List.of(1, 1, 1, 1, 1);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 5);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithForLoop(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithForLoop_givenTwoNumbers_expectedTwoSizeMap() {
        // given
        List<Integer> givenNumbers = List.of(1, 2);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 1);
        expectedMap.put(2, 1);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithForLoop(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithForLoop_givenDifferentNumbers_expectedMapValuesEqualOne() {
        // given
        List<Integer> givenNumbers = List.of(1, 3, 4, 2, 5, 10, 10_000);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 1);
        expectedMap.put(3, 1);
        expectedMap.put(4, 1);
        expectedMap.put(2, 1);
        expectedMap.put(5, 1);
        expectedMap.put(10, 1);
        expectedMap.put(10_000, 1);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithForLoop(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }

    @Test
    public void getCountMapWithForLoop_givenDifferentRepeatingNumbers_expectedMap() {
        // given
        List<Integer> givenNumbers = List.of(1, 3, 4, 2, 5, 10, 10_000, 1, 1, 2, 1, 3, 10_000, 2, 10_000);
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 4);
        expectedMap.put(3, 2);
        expectedMap.put(4, 1);
        expectedMap.put(2, 3);
        expectedMap.put(5, 1);
        expectedMap.put(10, 1);
        expectedMap.put(10_000, 3);

        // when
        Map<Integer, Integer> actualMap = JavaTask.getCountMapWithForLoop(givenNumbers);

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap);
    }
}
