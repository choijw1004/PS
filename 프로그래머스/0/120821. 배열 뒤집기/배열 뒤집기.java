class Solution {
    public int[] solution(int[] num_list) {
        int[] tmp = new int[num_list.length];
        
        for(int i = 0 ; i < tmp.length; i++){
            tmp[i] = num_list[num_list.length -1 - i];
        }
        
        return tmp;
    }
}