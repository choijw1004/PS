import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList();
        
        for(var s : strArr){
            if(!s.contains("ad")) list.add(s);
        }
        
        String[] ans = new String[list.size()];
        
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}