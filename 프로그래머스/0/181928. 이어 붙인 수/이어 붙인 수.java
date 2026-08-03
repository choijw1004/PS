class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        
        for(var n : num_list){
            if(n % 2 == 0) odd.append(Integer.toString(n));
            else even.append(Integer.toString(n));
        }
        
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}