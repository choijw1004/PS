class Solution {
    public int solution(String myString, String pat) {
        int n = myString.length();
        int target = pat.length();
        int cnt = 0;
        
        for(int i = 0 ; i+target <= n; i++){
            StringBuilder sb = new StringBuilder();
    
            for(int j = i; j < i + target; j++){
                sb.append(myString.charAt(j));
            }
            
            if(sb.toString().equals(pat)) cnt++;
        }
        
        return cnt;
    }
}