import java.util.*;

class Solution {
    public String solution(String myString, String pat) {
        int n = myString.length();
        int max = -1;
        List<String> list = new ArrayList<>();
        for(int i = n; i >= 0; i--){
            String sub = myString.substring(0, i);
            
            if(sub.endsWith(pat)) list.add(sub);
        }
        
        Collections.sort(list, (a,b) -> b.length() - a.length());
        
        return list.get(0);
    }
}