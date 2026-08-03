import java.util.*;

class Solution {
    public int solution(int[] array) {
        int n = array.length;
        
        Arrays.sort(array);
        
        return array[n / 2];
    }
}