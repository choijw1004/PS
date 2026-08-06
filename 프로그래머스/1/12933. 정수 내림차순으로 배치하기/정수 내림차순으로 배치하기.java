import java.util.*;

class Solution {
    public long solution(long n) {
        List<Character> list = new ArrayList<>();
        
        for(var c : Long.toString(n).toCharArray()){
            list.add(c);    
        }
        
        Collections.sort(list, (a,b) -> b - a);
        
        StringBuilder sb = new StringBuilder();
        
        for(var c : list){
            sb.append(c);
        }
        
        return Long.parseLong(sb.toString());
    }
}