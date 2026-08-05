import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int n = finished.length;
        List<String> list = new ArrayList<>();
        
        for(int i = 0 ; i < n; i++){
            if(!finished[i]) list.add(todo_list[i]);
        }
        
        String[] ans = new String[list.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}