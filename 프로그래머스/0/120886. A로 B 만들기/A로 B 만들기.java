import java.util.*;

class Solution {
    public int solution(String before, String after) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        
        for(int i = 0 ; i < before.length(); i++){
            char c1 = before.charAt(i);
            char c2 = after.charAt(i);
            
            m1.put(c1, m1.getOrDefault(c1, 0) + 1);
            m2.put(c2, m2.getOrDefault(c2, 0) + 1);
        }
        
        return m1.equals(m2) ? 1 : 0;
    }
}