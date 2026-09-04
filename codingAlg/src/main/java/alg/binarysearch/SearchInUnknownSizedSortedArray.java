package alg.binarysearch;

public class SearchInUnknownSizedSortedArray {
    public int search(Dictionary dictionary, int target){
        int left = 0;
        int right = 1;

        while(dictionary.get(right) != null && dictionary.get(right) < target){
            left = right;
            right = right * 2;
        }
        return binarysearch(dictionary, target, left, right);
    }

    private int binarysearch(Dictionary dictionary, int target, int left, int right){
       while (left <= right) {
         int mid = left + (right - left)/2;
         if (dictionary.get(mid)!= null && dictionary.get(mid) == target) {
            return mid;
         } else if (dictionary.get(mid) > target) {
            right = mid - 1;
         } else {
            left = mid + 1;
         }
       }
       return -1;
    }
}
