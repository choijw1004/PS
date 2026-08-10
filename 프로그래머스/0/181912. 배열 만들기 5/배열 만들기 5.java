import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(var str : intStrs){
            String tmp = str.substring(s, s + l);
            int t = Integer.parseInt(tmp);
            if(t > k) list.add(t);
        }        
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}