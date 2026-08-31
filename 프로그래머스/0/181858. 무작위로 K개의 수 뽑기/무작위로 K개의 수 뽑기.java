import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(var n : arr){
            if(set.contains(n)) continue;
            
            list.add(n);
            set.add(n);
            
            if(list.size() == k) break;
        }
        
        while(list.size() < k){
            list.add(-1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}