package alg.dp;

public class MaxProductOfCuttingRope {
    public int maxProduct(int length){
        int[] array = new int[length + 1];
        array[1] = 0;
        for(int i = 2; i <= length; i++){
            for(int j = 1; j < i; j++){
                array[i] = Math.max(array[i], Math.max(j, Math.max(j, array[j] * (i - j))));
            }
        }
        return array[length];
    }
    
}
