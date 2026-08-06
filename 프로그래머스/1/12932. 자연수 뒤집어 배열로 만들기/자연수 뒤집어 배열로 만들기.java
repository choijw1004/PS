class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        
        int[] ans = new int[s.length()];
        
        for(int i = 0 ; i < s.length(); i++){
            ans[s.length() - i - 1] = s.charAt(i) - '0';
        }
        
        return ans;
    }
}