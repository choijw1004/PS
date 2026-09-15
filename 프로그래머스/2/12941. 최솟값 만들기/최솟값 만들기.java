import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int ans = 0;
        
        for(int i = 0; i < A.length; i++){
            int a = A[i];
            int b = B[B.length - 1 - i];
            
            ans += (a * b);
        }
        
        return ans;
    }
}