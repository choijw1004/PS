class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] ans = new int[n];
        
        for(int i = 0 ; i < n; i++){
            int r = 1;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                
                if(emergency[i] < emergency[j]) r++;
            }
            
            ans[i] = r;
        }
        
        return ans;
    }
}