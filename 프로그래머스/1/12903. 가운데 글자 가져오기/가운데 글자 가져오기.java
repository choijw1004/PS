class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        
        if(n % 2 == 0){
            int i1 = n / 2;
            int i2 = i1 - 1;
            
            sb.append(s.charAt(i2));
            sb.append(s.charAt(i1));
            
        }  
        else{
            sb.append(s.charAt(n / 2));
        }
        
        return sb.toString();
    }
}