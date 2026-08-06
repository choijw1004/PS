class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
            if(direction.equals("left")){
                
                // 0 1 2 
                // 1 2 3 
                
                // 0 1 2
                // 3 1 2
                ans[i] = numbers[(i + 1) % n];
            }
            
            else{
                ans[i] = numbers[(i - 1 + n) % n];
            }
        }
        return ans;
    }
}