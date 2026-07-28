import java.util.*;

class Solution {
    public String solution(String my_string) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for(var c : my_string.toCharArray()){
            if(!set.contains(c)) sb.append(c);
        }
        
        return sb.toString();
    }
}