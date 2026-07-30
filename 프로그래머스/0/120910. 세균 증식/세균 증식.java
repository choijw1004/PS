import java.util.*;

class Solution {
    public int solution(int n, int t) {
        int start = n;
        
        while(t-- >0){
            start *= 2;
        }
        
        return start;
        
    }
}