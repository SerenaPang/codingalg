package alg.dp;

public class LargestSubarraySum {
    public int LargestSubarraySum(int[] array){
        int result = array[0];
        int cur = array[0];
        for(int i = 1; i < array.length; i++){
            cur = Math.max(cur + array[i], array[i]);
            result = Math.max(result, cur);
        }
        return result;
    }
}
