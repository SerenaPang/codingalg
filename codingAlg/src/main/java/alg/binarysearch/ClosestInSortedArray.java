package alg.binarysearch;

public class ClosestInSortedArray {
    public int closest(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }else if (array[mid] > target) {
                right = mid;
            } else if (array[mid] < target) {
                left = mid;
            }
        }
        // decide which number is the closest
        if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
            return left;
        } else if (Math.abs(array[left] - target) >= Math.abs(array[right] - target)) {
            return right;
        }
        return -1;
    }

}
