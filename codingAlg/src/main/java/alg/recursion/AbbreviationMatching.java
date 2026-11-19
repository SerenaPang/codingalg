package alg.recursion;

public class AbbreviationMatching {
    public boolean match(String input, String pattern){
        return match(input, pattern, 0, 0);
    }

    private boolean match(String s, String t, int si, int ti){
        if(si == s.length() && ti == t.length()){
            return true;
        }
        if(si >= s.length() || ti == t.length()){
            return false;
        }
        //if it's a char, check if it matches
        if(t.charAt(ti) < '0' || t.charAt(ti) > '9'){
            if(s.charAt(si) == t.charAt(ti)){
                return match(s, t, si + 1,ti + 1);
            }
            return false;
        }
        //if it's a digit convert to quantity and move index to next char
        int count = 0;
        while(ti < t.length() && t.charAt(ti) >= '0' && t.charAt(ti) <= '9'){
            count = count * 10 + (t.charAt(ti) - '0');
            ti++;
        }
        return match(s, t, si + count, ti);
    }
}
