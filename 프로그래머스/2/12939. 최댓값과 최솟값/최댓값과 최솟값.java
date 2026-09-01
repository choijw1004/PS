import java.util.*;

class Solution {
    public String solution(String s) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        String[] tmp = s.split(" ");
        
        for(var st : tmp){
            ts.add(Integer.parseInt(st));
        }
        
        String a = Integer.toString(ts.first());
        String b = Integer.toString(ts.last());
        
        return a + " " + b;
    }
}