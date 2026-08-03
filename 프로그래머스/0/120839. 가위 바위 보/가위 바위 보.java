class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < rsp.length(); i++){
            char c = rsp.charAt(i);
            
            if(c == '2') sb.append("0");
            else if(c == '5') sb.append("2");
            else sb.append("5");
        }
        
        return sb.toString();
    }
}