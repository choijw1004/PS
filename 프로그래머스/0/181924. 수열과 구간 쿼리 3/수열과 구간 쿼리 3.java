class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries){
            int start = q[0];
            int end = q[1];
            
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }
        
        return arr;
    }
}