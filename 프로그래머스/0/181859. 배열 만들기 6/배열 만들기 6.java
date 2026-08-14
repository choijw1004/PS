import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        int n = arr.length;
        int i = 0;
        
        while(i < n){
            if(stack.isEmpty()) {
                stack.push(arr[i]);
                i++;
            }
            
            else if(stack.peek() == arr[i]){
                stack.pop();
                i++;
            }
            
            else{
                stack.push(arr[i]);
                i++;
            }
        }
        
        if(stack.size() == 0) return new int[]{-1};
        
        int[] ans = new int[stack.size()];
        
        int size = stack.size();
        for(int idx = size - 1; idx >= 0; idx--){
            ans[idx] = stack.pop();
        }
        
        return ans;
    }
}