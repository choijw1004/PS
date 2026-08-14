import java.util.*;

class Solution {
    public int solution(String[] order) {
        int sum = 0;
        
        for(var s : order){
            if(s.equals("anything") || s.contains("americano")) sum += 4500;
            else sum += 5000;
        }
        
        return sum;
    }
}