package alg.string;

import java.util.List;
import java.util.ArrayList;

public class Tokenize {
    public String[] tokenize(String s) {
        List<String> listStr = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
                i++;
            }
            int begin = i;
            while (i < s.length() && !Character.isWhitespace(s.charAt(i))) {
                i++;
            }
            int end = i;
            if (end > begin) {
                listStr.add(s.substring(begin, end));
            }
        }
        return listStr.toArray(new String[0]);
    }

    public String[] tokenizer(String s) {
        List<String> listStr = new ArrayList<>();
        int begin = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                begin++;
            } else {
                if (i + 1 < s.length() && Character.isWhitespace(s.charAt(i+1))) {
                    listStr.add(s.substring(begin, i + 1));
                    begin = i + 1;
                } else if (i + 1 == s.length()) {
                    listStr.add(s.substring(begin, i + 1));
                }
                
            }
        }
        return listStr.toArray(new String[0]);
    }
}
