class Solution {
    public int solution(String message) {
        int sum = 0;
        
        for(var c : message.toCharArray()){
            sum += 2;
        }
        
        return sum;
    }
}