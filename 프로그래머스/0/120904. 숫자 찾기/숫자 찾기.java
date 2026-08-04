class Solution {
    public int solution(int num, int k) {
        int i = 1;
        
        for(var c : Integer.toString(num).toCharArray()){
            if(c - '0' == k) return i;
            
            i++;
        }
        
        return -1;
    }
}