import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        
        HashSet<Integer> set = new HashSet<>();
        for(var d : delete_list) set.add(d);
        
        for(var n : arr){
            if(set.contains(n)) continue;
            else list.add(n);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}