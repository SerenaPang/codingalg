package alg.recursion;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderTraversal {
    public List<Integer> spiral(int[][] matrix){
        List<Integer> list = new ArrayList<Integer>();
        recursiveTraverse(matrix, 0, matrix.length, list);
        return list;
    }

    private void recursiveTraverse(int[][] matrix, int offset, int size, List<Integer> result){
        if(size == 0){
            return;
        }
        if(size == 1){
            result.add(matrix[offset][offset]);
            return;
        }
        //up
        for(int i = 0; i < size - 1; i++){
            result.add(matrix[offset][offset + i]);
        }
        //right
        for(int i = 0; i < size - 1; i++){
            result.add(matrix[offset + i][offset + size - 1]);
        }
        //down
        for(int i = size - 1; i >= 1; i--){
            result.add(matrix[offset + size - 1][offset]);
        }
        //left
        for(int i = size - 1; i >= 1; i--){
            result.add(matrix[offset + i][offset]);
        }
        recursiveTraverse(matrix, offset + 1, size - 2, result);
    }
}
