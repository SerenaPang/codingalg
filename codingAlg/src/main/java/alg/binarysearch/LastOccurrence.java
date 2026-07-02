package alg.binarysearch;

public class LastOccurrence {
    public int search(int[] array, int target){
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1){
            int mid = left + (right - left)/2;
            if (array[mid] <= target){
                left = mid;
            } else {
                right = mid;
            }
        }
        if (array[right] == target) {
            return right;
        } else if (array[left] == target) {
            return left;
        }
        return -1;
    }
}
