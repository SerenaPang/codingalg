package alg.dfs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII {
    public List<String> subSets(String set){
        List<String> result = new ArrayList<String>();
        if(set == null){
            return result;
        }
        char[] arraySet = set.toCharArray();
        Arrays.sort(arraySet);
        StringBuilder sb = new StringBuilder();
        helper(arraySet, sb, 0, result);
        return result;
    }

    //at each level, determine if the element at index should be included in the subset or not
    private void helper(char[] set, StringBuilder sb, int index, List<String> result){
        if(index == set.length){
            result.add(sb.toString());
            return;
        }
        helper(set, sb.append(set[index]), index + 1, result);
        sb.deleteCharAt(sb.length() - 1);
        //skip all the consecutive and duplicate elements
        while(index < set.length - 1 && set[index] == set[index + 1]){
            index ++;
        }
        helper(set, sb, index + 1, result);
    }
}
