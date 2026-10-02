import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
            
        for(int t = 0; t < picture.length; t++){
            String s = picture[t];
            
            StringBuilder sb = new StringBuilder();
            char[] arr = s.toCharArray();
            
            for(int i = 0; i < arr.length; i++){
                char c = arr[i];
                for(int j =0; j < k; j++){
                    sb.append(c);
                }
            }
            
            for(int v = 0; v < k; v++){
                list.add(sb.toString());
            }
        }
        
        String[] ans = new String[list.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}