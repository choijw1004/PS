class Solution {
    public int solution(int[] numbers, int k) {
        int startIdx = 0;
        int turn = 1;
        int ans = 0;
        
        while(true){
            if(turn == k) break;
            startIdx += 2;
            turn++;
            ans = numbers[startIdx % numbers.length];
        }
        
        return ans;
    }
}