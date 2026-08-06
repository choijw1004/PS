import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0 ; i < my_string.length(); i++){
            String tmp = my_string.substring(i);
            
            list.add(tmp);
        }
        
        Collections.sort(list);
        
        String[] ans = new String[list.size()];
        
        for(int i = 0 ; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}