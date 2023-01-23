package ru


import org.junit.jupiter.api.Test

import static org.assertj.core.api.Assertions.assertThat

class GroovyTaskTest {
    @Test
    void getCountMapWithForLoop_givenNull_expectedEmpty() {
        // given
        List<Integer> givenNumbers = null

        // when
        Map<Integer, Integer> actualMap = GroovyTask.getCountMapWithForLoop(givenNumbers)

        // then
        assertThat(actualMap).isNull()
    }

    @Test
    void getCountMapWithForLoop_givenOneNumber_expectedOneSizeMap() {
        // given
        List<Integer> givenNumbers = [1]
        Map<Integer, Integer> expectedMap = [1: 1]

        // when
        Map<Integer, Integer> actualMap = GroovyTask.getCountMapWithForLoop(givenNumbers)

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap)
    }

    @Test
    void getCountMapWithForLoop_givenNumSameNumberFiveTimes_expectedOneSizeMap() {
        // given
        List<Integer> givenNumbers = [1, 1, 1, 1, 1]
        Map<Integer, Integer> expectedMap = [1: 5]

        // when
        Map<Integer, Integer> actualMap = GroovyTask.getCountMapWithForLoop(givenNumbers)

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap)
    }

    @Test
    void getCountMapWithForLoop_givenTwoNumbers_expectedTwoSizeMap() {
        // given
        List<Integer> givenNumbers = [1, 2]
        Map<Integer, Integer> expectedMap = [1: 1, 2: 1]

        // when
        Map<Integer, Integer> actualMap = GroovyTask.getCountMapWithForLoop(givenNumbers)

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap)
    }

    @Test
    void getCountMapWithForLoop_givenDifferentNumbers_expectedMapValuesEqualOne() {
        // given
        List<Integer> givenNumbers = [1, 3, 4, 2, 5, 10, 10_000]
        Map<Integer, Integer> expectedMap = [1: 1, 3: 1, 4: 1, 2: 1, 5: 1, 10: 1, 10_000: 1]

        // when
        Map<Integer, Integer> actualMap = GroovyTask.getCountMapWithForLoop(givenNumbers)

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap)
    }

    @Test
    void getCountMapWithForLoop_givenDifferentRepeatingNumbers_expectedMap() {
        // given
        List<Integer> givenNumbers = [1, 3, 4, 2, 5, 10, 10_000, 1, 1, 2, 1, 3, 10_000, 2, 10_000]
        Map<Integer, Integer> expectedMap = [1: 4, 3: 2, 4: 1, 2: 3, 5: 1, 10: 1, 10_000: 3]

        // when
        Map<Integer, Integer> actualMap = GroovyTask.getCountMapWithForLoop(givenNumbers)

        // then
        assertThat(actualMap).containsExactlyInAnyOrderEntriesOf(expectedMap)
    }
}
