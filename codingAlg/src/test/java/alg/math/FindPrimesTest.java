package alg.math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FindPrimesTest {
    FindPrimes findPrimes = new FindPrimes();

    @Test
    public void testPrimeNumbers() {
        assertTrue(findPrimes.isPrimes(2));
        assertTrue(findPrimes.isPrimes(3));
        assertTrue(findPrimes.isPrimes(5));
        assertTrue(findPrimes.isPrimes(7));
        assertTrue(findPrimes.isPrimes(11));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(findPrimes.isPrimes(4));
        assertFalse(findPrimes.isPrimes(9));
        assertFalse(findPrimes.isPrimes(10));
    }

  @Test
    void testFindTenPrimes() {
        List<Integer> expected = Arrays.asList(
                2, 3, 5, 7, 11,
                13, 17, 19, 23, 29
        );

        List<Integer> actual = findPrimes.findTenPrimes();
        assertEquals(expected, actual);
    }

}
