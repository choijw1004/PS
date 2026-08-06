class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(var c : myString.toCharArray()){
            if(c - 'l' <= 0) sb.append("l");
            else sb.append(c);
        }
        
        return sb.toString();
        
    }
}