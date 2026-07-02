package alg.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassicalBinarySearchTest {

    @Test
    void shouldFindTargetInMiddle() {

        ClassicalBinarySearch bs =
                new ClassicalBinarySearch();

        int result =
                bs.search(
                        new int[]{1, 3, 5, 7, 9},
                        5
                );

        assertEquals(2, result);
    }

    @Test
    void shouldFindFirstElement() {

        ClassicalBinarySearch bs =
                new ClassicalBinarySearch();

        int result =
                bs.search(
                        new int[]{1, 3, 5, 7, 9},
                        1
                );

        assertEquals(0, result);
    }

    @Test
    void shouldFindLastElement() {

        ClassicalBinarySearch bs =
                new ClassicalBinarySearch();

        int result =
                bs.search(
                        new int[]{1, 3, 5, 7, 9},
                        9
                );

        assertEquals(4, result);
    }

    @Test
    void shouldReturnMinusOneWhenTargetNotFound() {

        ClassicalBinarySearch bs =
                new ClassicalBinarySearch();

        int result =
                bs.search(
                        new int[]{1, 3, 5, 7, 9},
                        6
                );

        assertEquals(-1, result);
    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {

        ClassicalBinarySearch bs =
                new ClassicalBinarySearch();

        int result =
                bs.search(
                        new int[]{},
                        5
                );

        assertEquals(-1, result);
    }

    @Test
    void shouldReturnMinusOneForNullArray() {

        ClassicalBinarySearch bs =
                new ClassicalBinarySearch();

        int result =
                bs.search(
                        null,
                        5
                );

        assertEquals(-1, result);
    }
}