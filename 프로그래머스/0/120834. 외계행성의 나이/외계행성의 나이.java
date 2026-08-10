import java.util.*;

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        for(var c : Integer.toString(age).toCharArray()){
            sb.append((char)('a' + c - '0'));
        }
        
        return sb.toString();
    }
}