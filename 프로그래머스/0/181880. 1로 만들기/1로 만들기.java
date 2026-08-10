class Solution {
    private int cal(int start){
        int cnt = 0;
        
        while(start != 1){
            if(start % 2 == 0) start /= 2;
            else start = (start - 1) / 2;
            
            cnt++;
        }
        
        return cnt;
    }
    public int solution(int[] num_list) {
        int sum = 0;
        
        for(var n : num_list){
            sum += cal(n);
        }
        
        return sum;
    }
}