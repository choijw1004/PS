class Solution {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        
        int n = a.length;
        
        for(int i = 0; i < n; i++){
            sum += a[i] * b[i];
        }
        
        return sum;
    }
}