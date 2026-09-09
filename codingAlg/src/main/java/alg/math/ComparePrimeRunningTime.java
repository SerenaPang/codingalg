package alg.math;

public class ComparePrimeRunningTime {

    public static void main(String[] args) {

        int maxNumber = 100000;

        // =========================
        // FindPrimes
        // =========================

        FindPrimes findPrimes = new FindPrimes();

        long startFindPrimes = System.nanoTime();

        for (int i = 2; i <= maxNumber; i++) {
            findPrimes.isPrimes(i);
        }

        long endFindPrimes = System.nanoTime();

        long findPrimesTime = endFindPrimes - startFindPrimes;


        // =========================
        // CribaPrimes
        // =========================

        CribaPrimes criba = new CribaPrimes(maxNumber);

        long startCriba = System.nanoTime();

        criba.initArray(maxNumber);
        criba.implementCriba();
        criba.findPrimes(maxNumber);

        long endCriba = System.nanoTime();

        long cribaTime = endCriba - startCriba;


        // =========================
        // Print result
        // =========================

        System.out.println("================================");
        System.out.println("Running Time Comparison");
        System.out.println("================================");

        System.out.println(
                "FindPrimes:  " + findPrimesTime + " ns");

        System.out.println(
                "CribaPrimes: " + cribaTime + " ns");

        System.out.println("================================");
    }
}