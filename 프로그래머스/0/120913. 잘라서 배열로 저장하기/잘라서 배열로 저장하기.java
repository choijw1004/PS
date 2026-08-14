import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < len; i += n) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = i; j < i + n; j++) {
                if (j < len) sb.append(my_str.charAt(j));
            }
            
            list.add(sb.toString());
        }
        
        String[] ans = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}