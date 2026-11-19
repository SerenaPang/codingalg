package alg.math;

import java.util.ArrayList;
import java.util.List;

public class CribaPrimes {
    int maxNumber;
    boolean[] isPrime;

    public CribaPrimes(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void initArray(int maxNumber) {
        isPrime = new boolean[maxNumber + 1];
        for (int i = 2; i <= maxNumber; i++) {
            isPrime[i] = true;
        }
    }

    public void implementCriba() {
        for (int i = 2; i < maxNumber; i++) {
            for (int j = 2; (i * j) <= maxNumber; j++) {
                isPrime[i * j] = false;
            }
        }
    }

    //assume n < maxnum
    public List<Integer> findPrimes(int n) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                results.add(i);
            }
        }
        return results;
    }
}
