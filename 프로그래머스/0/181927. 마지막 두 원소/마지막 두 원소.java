import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        for(var n : num_list) list.add(n);
        
        int l1 = list.get(list.size() - 1);
        int l2 = list.get(list.size() - 2);
        
        if(l1 > l2) list.add(l1 - l2);
        else list.add(l1 * 2);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}