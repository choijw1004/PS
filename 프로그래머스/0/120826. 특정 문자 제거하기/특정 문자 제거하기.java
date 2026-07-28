class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        
        for(var c : my_string.toCharArray()){
            if(c == letter.charAt(0)) continue;
            else sb.append(c);
        }
        return sb.toString();
    }
}