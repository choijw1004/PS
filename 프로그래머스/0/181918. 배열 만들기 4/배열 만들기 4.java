import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        while(i < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                i++;
                continue;
            }
            
            else if(stack.peek() < arr[i]){
                stack.push(arr[i]);
                i++;
                continue;
            }
            else{
                stack.pop();
            }
        }
        
        int[] ans = new int[stack.size()];
        
        for(int t = stack.size() - 1; t >=0; t--){
            ans[t] = stack.pop();
        }
        
        return ans;
    }

}