class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        for(var n : num_list){
            sum += n;
            mul *= n;
        }
        
        return num_list.length >= 11 ? sum : mul;
    }
}