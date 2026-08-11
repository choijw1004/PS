import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        
        for(var c : my_string.toCharArray()){
            if(set.contains(c)) continue;
            sb.append(c);
            
            set.add(c);
        }
        
        return sb.toString();
    }
}