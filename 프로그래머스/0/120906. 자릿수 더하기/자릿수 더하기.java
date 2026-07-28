class Solution {
    public int solution(int n) {
        int sum = 0;
        
        for(var c : Integer.toString(n).toCharArray()){
            sum += c - '0';    
        }
        
        return sum;
    }
}