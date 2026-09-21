import java.util.*;

class Solution {
    private boolean canChange(String s1, String s2){
        int cnt = 0;
        
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if(c1 != c2) cnt++;
        }
        
        return cnt >= 2 ? false : true;
    }
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<String> q = new LinkedList<>();
        q.offer(begin);
        int ans = 0;
        
        while(!q.isEmpty()){
            for(int s = 0; s < q.size(); s++){
                String curr = q.poll();
                if(curr.equals(target)) return ans;
                
                
                for(int i = 0; i < words.length; i++){
                    String next = words[i];
                    if(visited[i]) continue;
                    if(!canChange(curr, next)) continue;
                    visited[i] = true;
                    q.offer(next);
                }
            }
            ans++;
        }
        
        return 0;
    }
}