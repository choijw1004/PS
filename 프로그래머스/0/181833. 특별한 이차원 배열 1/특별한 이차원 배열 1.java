class Solution {
    public int[][] solution(int n) {
        int[][] ans = new int[n][n];
        
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = 0;
                
                if(i == j) ans[i][j] = 1;
            }
        }
        
        return ans;
    }
}