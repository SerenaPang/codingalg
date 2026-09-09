package alg.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CribaPrimesTest {

    @Test
    void testImplementCriba() {
        CribaPrimes criba = new CribaPrimes(10);

        criba.initArray(10);
        criba.implementCriba();

        // Prime numbers
        assertTrue(criba.isPrime[2]);
        assertTrue(criba.isPrime[3]);
        assertTrue(criba.isPrime[5]);
        assertTrue(criba.isPrime[7]);

        // Non-prime numbers
        assertFalse(criba.isPrime[4]);
        assertFalse(criba.isPrime[6]);
        assertFalse(criba.isPrime[8]);
        assertFalse(criba.isPrime[9]);
        assertFalse(criba.isPrime[10]);
    }

    @Test
    void testFindPrimes() {
        CribaPrimes criba = new CribaPrimes(30);

        criba.initArray(30);
        criba.implementCriba();

        List<Integer> expected = Arrays.asList(
                2, 3, 5, 7, 11,
                13, 17, 19, 23, 29);

        List<Integer> actual = criba.findPrimes(30);

        assertEquals(expected, actual);
    }
}