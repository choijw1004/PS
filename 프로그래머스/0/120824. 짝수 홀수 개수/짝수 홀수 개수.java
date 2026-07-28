class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;
        
        for(var n : num_list){
            if(n % 2 == 0) a++;
            else b++;
        }
        return new int[]{a,b};
    }
}