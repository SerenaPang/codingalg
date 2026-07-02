package alg.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceTest {

    private FirstOccurrence fo;

    @BeforeEach
    void setUp() {
        fo = new FirstOccurrence();
    }

    @Test
    void target_appears_once_returns_its_index() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, fo.search(arr, 5));
    }

    @Test
    void target_has_duplicates_returns_first_index() {
        int[] arr = {1, 2, 2, 2, 3, 4};
        assertEquals(1, fo.search(arr, 2));
    }

    @Test
    void target_duplicates_fill_entire_array_returns_zero() {
        int[] arr = {7, 7, 7, 7, 7};
        assertEquals(0, fo.search(arr, 7));
    }

    @Test
    void target_is_first_element() {
        int[] arr = {1, 3, 5, 7};
        assertEquals(0, fo.search(arr, 1));
    }

    @Test
    void target_is_last_element() {
        int[] arr = {1, 3, 5, 7};
        assertEquals(3, fo.search(arr, 7));
    }

    @Test
    void target_duplicates_at_start_of_array() {
        int[] arr = {2, 2, 4, 6, 8};
        assertEquals(0, fo.search(arr, 2));
    }

    @Test
    void target_duplicates_at_end_of_array() {
        int[] arr = {1, 3, 5, 9, 9};
        assertEquals(3, fo.search(arr, 9));
    }

    @Test
    void target_not_in_array_returns_minus_one() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, fo.search(arr, 4));
    }

    @Test
    void target_smaller_than_all_elements_returns_minus_one() {
        int[] arr = {3, 5, 7};
        assertEquals(-1, fo.search(arr, 1));
    }

    @Test
    void target_larger_than_all_elements_returns_minus_one() {
        int[] arr = {3, 5, 7};
        assertEquals(-1, fo.search(arr, 9));
    }

    @Test
    void single_element_matches_target() {
        int[] arr = {42};
        assertEquals(0, fo.search(arr, 42));
    }

    @Test
    void single_element_does_not_match_target() {
        int[] arr = {42};
        assertEquals(-1, fo.search(arr, 0));
    }

    @Test
    void two_elements_target_is_first() {
        int[] arr = {3, 7};
        assertEquals(0, fo.search(arr, 3));
    }

    @Test
    void two_elements_target_is_second() {
        int[] arr = {3, 7};
        assertEquals(1, fo.search(arr, 7));
    }

    @Test
    void two_identical_elements_returns_zero() {
        int[] arr = {5, 5};
        assertEquals(0, fo.search(arr, 5));
    }
}