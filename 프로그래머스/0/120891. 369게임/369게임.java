import java.util.*;

class Solution {
    public int solution(int order) {
        int cnt = 0;
        
        for(var c : Integer.toString(order).toCharArray()){
            int t = c - '0';
            
            if(t == 3 || t == 6 || t == 9) cnt++;
        }
        return cnt;
    }
}