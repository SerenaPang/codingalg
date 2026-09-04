package alg.binarysearch;

public class SearchInBitonicArray {
    public int search(int[] array, int target) {
        int peak = findPeak(array);
        int index = searchInIncreasing(array, 0, peak, target);
        if (index != -1){
            return index;
        }
        return searchInDecreasing(array, peak + 1, array.length - 1, target);
    }

    public int searchInIncreasing(int[] array, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int searchInDecreasing(int[] array, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                right = mid - 1;     
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int findPeak(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] < array[mid + 1]) {
                left = mid + 1;
            } else if (array[mid] > array[mid + 1]) {
                right = mid;
            }
        }
        return right;
    }
}
