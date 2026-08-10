class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(var q : queries){
            int start = q[0];
            int end = q[1];
            
            for(int i = start; i <= end; i++){
                arr[i] += 1;
            }
        }
        
        return arr;
    }
}