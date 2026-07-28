import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        int ans = -1;
        
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i) continue;
                ans = Math.max(numbers[i] * numbers[j], ans);
            }
        }
        
        return ans;
    }
}