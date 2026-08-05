import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(var s : str){
            if(!s.isEmpty()) list.add(s);
        }
        
        String[] ans = new String[list.size()];
        
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        Arrays.sort(ans);
        
        return ans;
    }
}