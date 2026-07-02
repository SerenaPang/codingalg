package alg.binarysearch;

public class SearchInSortedMatrix {
    public int[] search(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[]{-1,-1};
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int rowMidIndex = mid / cols;
            int colMidIndex = mid % cols;
            if (matrix[rowMidIndex][colMidIndex] == target) {
                return new int[] {rowMidIndex, colMidIndex};
            } else if (matrix[rowMidIndex][colMidIndex] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
