package alg.dp;

public class Fibonacci {
    public long fibonacci(int k){
        if(k <= 0){
            return 0;
        }
        long array[] = new long[k + 1];
        array[1] = 1;
        for(int i = 2; i <= k; i++){
            array[i] = array[i - 2] + array[i-1];
        }
        return array[k];
    }
}
