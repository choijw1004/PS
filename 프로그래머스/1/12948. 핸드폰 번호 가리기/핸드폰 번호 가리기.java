class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        int n = phone_number.length();
        
        for(int i = 0 ; i < n-4; i++){
            sb.append("*");
        }
        
        for(int i = n-4 ; i < n; i++){
            sb.append(phone_number.charAt(i));
        }
        
        return sb.toString();
        
    }
}