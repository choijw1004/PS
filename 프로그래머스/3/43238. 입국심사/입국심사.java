class Solution {
    int n;
    int[] times;
    
    private long can(long mid){
        long cnt = 0;
        
        for(int t : times){
            cnt += mid / t;
        }
        
         return cnt;
    }
    public long solution(int n, int[] times) {
        this.n = n;
        this.times = times;
        long left = 1;
        long right = 1;
        
        for(int t : times){
            right = Math.max(t, right);    
        }
        long ans = 0;
        
        right *= n;
        
        while(left <= right){
            long mid = (left + right) / 2;
            
            //이분 탐색 최소
            if(can(mid) >= n){
                ans = mid;
                right = mid - 1;
            }
            
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}