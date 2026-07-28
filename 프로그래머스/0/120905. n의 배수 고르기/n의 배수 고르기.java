import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for(var v : numlist){
            if(v % n == 0) list.add(v); 
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}