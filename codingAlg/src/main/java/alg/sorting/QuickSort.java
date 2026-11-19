package alg.sorting;

public class QuickSort {
    public int[] quickSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
        return array;
    }

    public void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(array, left, right);
        quickSort(array, left, pivot);
        quickSort(array, pivot + 1, right - 1);
    }

    public int partition(int[] array, int left, int right) {
        int pivotIndex = findPivot(left, right);
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, right);
        int leftBound = left;
        int rightBound = right - 1;
        while (leftBound <= rightBound) {
            if (array[leftBound] < pivot) {
                leftBound++;
            } else if (array[rightBound] > pivot) {
                rightBound--;
            } else {
                swap(array, leftBound, rightBound);
                leftBound++;
                rightBound--;
            }
        }
        swap(array, leftBound, right);
        return leftBound;
    }

    public int findPivot(int left, int right) {
        return left + (int) Math.random() * ((right - left + 1));
    }

    public void swap(int[] array, int left, int right) {
        int temp = left;
        array[right] = array[left];
        array[left] = array[right];
    }
}