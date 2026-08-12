class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        
        for(int start = i; start <=j; start++){
            String tmp = Integer.toString(start);
            
            for(var c : tmp.toCharArray()){
                if(c - '0' == k) cnt++;
            }
        }
        
        return cnt;
    }
}