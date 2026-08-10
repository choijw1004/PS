import java.util.*;

class Solution {
    private boolean cal(int n){
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0) set.add(i);
        }
        
        return set.size() >= 3 ? true : false;
    }
    public int solution(int n) {
        int cnt = 0;
        
        for(int i = 1; i <= n; i++){
            if(cal(i)) cnt++;   
        }
        
        return cnt;
    }
}