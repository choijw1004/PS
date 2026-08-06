import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = Integer.toString(n);
        int ans = 0;
        
        for(var c : s.toCharArray()){
            ans += c-'0';
        }
        

        return ans;
    }
}