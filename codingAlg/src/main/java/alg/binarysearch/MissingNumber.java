package alg.binarysearch;

import java.util.HashSet;

public class MissingNumber {
    public int missing(int[] array){
      int len = array.length;
      HashSet<Integer> nums = new HashSet<Integer>();
      for (int num : array) {
        nums.add(num);
      }
      for (int i = 1; i <= len + 1; i++) {
        if (!nums.contains(i)) {
            return i;
        }
      }
      return len;
    }
}
