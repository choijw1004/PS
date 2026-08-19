import java.util.*;

class Solution {
    public String solution(String s) {
        char[] tmp = s.toCharArray();
        Arrays.sort(tmp);
        StringBuilder sb = new StringBuilder(new String(tmp));
        
        return sb.reverse().toString();
    }
}