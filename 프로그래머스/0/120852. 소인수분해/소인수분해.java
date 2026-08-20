import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
          
        int start = n;
        
        for(int i = 2; i <= n; i++){
            if(start % i == 0){
                list.add(i);
                
                while(start % i == 0){
                    start /= i;    
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}