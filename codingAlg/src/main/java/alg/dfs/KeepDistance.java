package alg.dfs;

//Method:generates all permutations
public class KeepDistance {
    public int[] KeepDistance(int k){
        int[] array = new int[2 * k];
        int[] used = new int[k + 1]; 
        return helper(array, 0, used) ? array : null;
    }

    private boolean helper(int[] array, int index, int[] used){
        if(index == array.length){
            return true;
        }
        for(int i = 1; i < used.length; i++){
            if(used[i] == 0 || used[i] == 1 && index > i && array[index - i - 1] == i){
                array[index] = i;
                used[i]++;
                if(helper(array, index + 1, used)){
                    return true;
                }
                used[i]--;
            }
        }
        return false;
    }
}
