package alg.string;

import java.util.List;
import java.util.ArrayList;

public class FindWord {
    public List<Pair<Integer, Integer>> findWord(String text, String word) {
        List<Pair<Integer, Integer>> result = new ArrayList<>();
        int lineCounter = 1;
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == '\n') {
                lineCounter++;
                continue;
            }
            if (isMatch(textArray, i, word)) {
                Pair<Integer, Integer> newPair = new Pair<Integer, Integer>(i, lineCounter);
                result.add(newPair);
                i = i + word.length() - 1;
            }
        }
        return result;
    }

    public boolean isMatch(char[] array, int index, String word) {
        if (index + word.length() > array.length) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (array[index] != word.charAt(i)) {
                return false;
            } else {
                index++;
            }
        }
        return true;
    }
}