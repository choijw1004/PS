class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1);
        int[] ans = new int[str.length];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = str[i].length();
        }
        
        return ans;
    }
}