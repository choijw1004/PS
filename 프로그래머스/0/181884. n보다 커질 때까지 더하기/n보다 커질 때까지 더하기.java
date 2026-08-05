class Solution {
    public int solution(int[] numbers, int n) {
        int sum =0;
        for(var num : numbers){
            sum += num;
            if(sum > n) return sum;
        }
        
        return 0;
    }
}