package alg.math;

import java.util.ArrayList;
import java.util.List;

public class FindPrimes {
    public boolean isPrimes(int num) {
        if (num <= 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findTenPrimes() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        int count = 3;
        while (result.size() < 10) {
            if (isPrimes(count)) {
                result.add(count);
            }
            count++;
        }
        return result;
    }
}