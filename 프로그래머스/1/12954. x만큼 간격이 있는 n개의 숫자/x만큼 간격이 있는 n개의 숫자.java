import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        long start = x;
        
        while(n -- > 0){
            list.add(start);
            
            start += x;
        }
        
        long[] ans = new long[list.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}