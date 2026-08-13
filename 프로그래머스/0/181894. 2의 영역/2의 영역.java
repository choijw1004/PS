import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2) list.add(i);
        }
        
        if(list.isEmpty()) return new int[]{-1};
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = list.get(0); i <= list.get(list.size() - 1); i++){
            ans.add(arr[i]);
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}