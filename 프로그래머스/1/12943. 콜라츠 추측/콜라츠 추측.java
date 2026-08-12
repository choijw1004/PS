class Solution {
    public int solution(int num) {
        int cnt = 0;
        long n = num;
        
        while(n != 1){
            cnt ++;
            if(cnt == 500) return -1;
            
            if(n % 2 ==0){
                n /= 2;
                continue;
            }
            else{
                n *= 3;
                n += 1;
                continue;
            }
        }
        
        return cnt;
    }
}