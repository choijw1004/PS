import java.util.*;

class Solution {
    public int solution(int[] array) {
        int cnt = 0;
            
        for(int n : array){
            for(var c : Integer.toString(n).toCharArray()){
                if(c == '7') cnt++;
            }
        }
        
        return cnt;
    }
}