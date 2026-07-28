class Solution {
    public int[] solution(int[] array) {
        int[] ans = new int[2];
        int max = -1;
        
        for(int i = 0 ; i < array.length; i++){
            if(max <= array[i]){
                max = array[i];
                ans[0] = max;
                ans[1] = i;
            }    
        }
        
        return ans;
    }
}