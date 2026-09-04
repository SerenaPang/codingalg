package alg.binarysearch;

public class FirstOccurrence {
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] < target) {
                left = mid;
            } else { // array[mid] >= target
                right = mid;
            }
        }
        if (array[left] == target) {
            return left;
        } else if (array[right] == target) {
            return right;
        }
        return -1;
    }
}
