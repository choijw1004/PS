import java.util.*;

class Solution {
    private boolean isPower(int n){
        String s = Integer.toBinaryString(n);
        int cnt = 0;
        
        for(var c : s.toCharArray()){
            if(c == '1') cnt++;
        }
        
        return cnt >= 2 ? false : true; 
    }
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(var a : arr) list.add(a);
        
        while(!isPower(list.size())) list.add(0);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}