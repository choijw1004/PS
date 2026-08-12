import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        
        List<Character> list = new ArrayList<>();
        for (var e : map.entrySet()) {
            if (e.getValue() == 1) list.add(e.getKey());
        }
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);
        return sb.toString();
    }
}