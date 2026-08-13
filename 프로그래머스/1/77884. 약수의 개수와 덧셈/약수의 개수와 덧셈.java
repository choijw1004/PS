class Solution {
    private int cal(int num){
        int cnt =0;
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0) cnt++;
        }
        
        return cnt % 2 ==0 ? num : -num;
    }
    
    public int solution(int left, int right) {
        int cnt = 0;
        
        for(int i = left; i <= right; i++){
            cnt += cal(i);
        }
        
        return cnt;
    }
}