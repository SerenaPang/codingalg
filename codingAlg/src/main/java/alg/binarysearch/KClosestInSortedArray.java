package alg.binarysearch;

public class KClosestInSortedArray {
    public int[] kClosest(int[] array, int target, int k) {
        int[] result = new int[k];
       
        int left = closestSmallerEqualsToTarget(array, target);
        int right = left + 1;
        for(int i = 0; i < k; i++){
            if (right >= array.length || left >= 0 && target - array[left] <= array[right] - target) {
                result[i] = array[left];
                left--;
            } else {
                result[i] = array[right];
                right++;
            }
        }       
        return result;
    }

    public int closestSmallerEqualsToTarget(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        // post processing,take which ever is smaller than target
        if (array[left] <= target) {
            return left;
        } else {
            return right;
        }
    }
}