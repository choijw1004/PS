import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(var s : strArr){
            int n = s.length();
            
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        
        return list.get(0).getValue();
    }
}