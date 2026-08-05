class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(var c : myString.toCharArray()){
            if(c == 'a') sb.append("A");
            else if(c == ' ') sb.append(" ");
            else if(c == 'A') sb.append("A");
            else sb.append(Character.toLowerCase(c));
        }
        
        return sb.toString();
    }
}