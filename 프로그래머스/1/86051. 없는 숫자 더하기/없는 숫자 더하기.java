import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(var n : numbers) set.add(n);
        
        for(int i = 0 ; i < 10; i++){
            if(!set.contains(i)) sum += i; 
        }   
        
        return sum;
    }
}