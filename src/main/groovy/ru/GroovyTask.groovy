package ru

class GroovyTask {
    static Map<Integer, Integer> getCountMapWithForLoop(List<Integer> numbers) {
        return numbers?.countBy { it }
    }
}
