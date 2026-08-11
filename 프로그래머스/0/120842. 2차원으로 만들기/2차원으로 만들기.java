class Solution {
    
    public int[][] solution(int[] num_list, int n) {
        int r = num_list.length / n;
        int c = n;
        
        int[][] ans = new int[r][c];
        int idx = 0;
        
        for(int i = 0 ; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = num_list[idx];
                idx++;
            }
        }
        
        return ans;
    }
}