import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        HashSet<Integer> set = new HashSet<>();
        for(var i : indices) set.add(i);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < my_string.length(); i++){
            if(set.contains(i)) continue;
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}