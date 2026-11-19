package alg.sorting;

public class MergeSort {
    public int[] MergeSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        MergeSortArray(array, left, right);
        return array;
    }

    public int[] MergeSortArray(int[] array, int left, int right){
        if(left == right){
            return new int[array[left]];
        }
        int mid = left + (right - left) / 2;
        int[] leftArray = MergeSortArray(array, left, mid);
        int[] rightArray = MergeSortArray(array, mid + 1, right);
        return merge(leftArray, rightArray);
    }

    public int[] merge(int[] leftArray, int[] rightArray){
        int[] resultArray = new int[leftArray.length + rightArray.length];
        int left = 0;
        int right = 0;
        int resultIndex = 0;
        while(left < leftArray.length && right < rightArray.length){
            if(leftArray[left] <= rightArray[right]){
                resultArray[resultIndex] = leftArray[left];
                left++;
            } else{
                resultArray[resultIndex] = rightArray[right];
                right++;
            }
            resultIndex++;
        }
        while(left < leftArray.length){
            resultArray[resultIndex] = leftArray[left];
            left++;
            resultIndex++;
        }
        while (right < rightArray.length) {
            resultArray[resultIndex] = rightArray[right];
            right++;
            resultIndex++;
        }
        return resultArray;
    }
}
