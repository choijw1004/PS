import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(var w : works) pq.add(w);
        
        while(!pq.isEmpty() && n-- > 0){
            int tmp = pq.poll();
            tmp--;
            
            if(tmp == 0) continue;
            
            pq.add(tmp);
        }
        
        long ans = 0;
        
        while(!pq.isEmpty()){
            long tmp = pq.poll();
            long tt = tmp * tmp;
            ans += tt;
        }
        
        return ans;
    }
}