import java.util.*;

class Solution {
    public String solution(String my_string) {
        String tmp = my_string.toLowerCase();
        
        char[] arr = tmp.toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);
    }
}