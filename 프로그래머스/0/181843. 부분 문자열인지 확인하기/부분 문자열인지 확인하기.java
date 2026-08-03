class Solution {
    public int solution(String my_string, String target) {
        int n = my_string.length();
        
        for(int i = 0; i < n-1; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(my_string.charAt(i));
            
            for(int j = i + 1; j < n; j++){
                sb.append(my_string.charAt(j));
                
                if(sb.toString().equals(target)) return 1;
            } 
        }
        
        return 0;
    }
}