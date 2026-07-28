class Solution {
    public int solution(int[] sides) {
        int max = -1;
        int sum = 0;
        
        for(var s : sides) {
            max = Math.max(max, s);
            sum += s;
        }
        
        sum -= max;
        
        return max < sum ? 1 : 2;
        
    }
}