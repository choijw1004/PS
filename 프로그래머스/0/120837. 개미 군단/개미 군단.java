class Solution {
    public int solution(int hp) {
        int[] arr = {5,3,1};
        int cnt = 0;
        
        int idx = 0;
        
        while(hp > 0){
            if(hp - arr[idx] >= 0){
                hp -= arr[idx];
                cnt ++;
            }
            
            else idx++;
        }
        return cnt;
    }
}