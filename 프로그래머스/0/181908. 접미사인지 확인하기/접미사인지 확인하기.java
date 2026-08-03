class Solution {
    public int solution(String my_string, String is_suffix) {
        int n = my_string.length();
        
        for(int i = 0; i < n; i++){
            String tmp = my_string.substring(i, n);
            
            if(tmp.equals(is_suffix)) return 1;
        }
    
        
        return 0;
    }
}