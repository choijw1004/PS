class Solution {
    public int solution(int n) {
        int start = 0;
        int sum = 0;
        
        if(n % 2 == 0) start = 0;
        else start = 1;
        
        for(int i = start ; i <= n; i+= 2){
            if(i % 2 == 0){
                sum += i * i ;
            }
            else sum += i;
        }
        
        return sum;
    }
}