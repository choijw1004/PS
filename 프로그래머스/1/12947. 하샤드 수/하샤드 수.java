class Solution {
    public boolean solution(int x) {
        String tmp = Integer.toString(x);
        int sum = 0;
        
        for(var c : tmp.toCharArray()){
            sum += c - '0';    
        }
        
        if(x % sum == 0) return true;
        else return false;
    }
}