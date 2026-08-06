class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int n = numLog.length;
        
        for(int i = 0; i < n - 1; i++){
            int start = numLog[i];
            int end = numLog[i + 1];
            
            int diff = end - start;
            
            if(diff == -1) sb.append("s");
            else if(diff == 1) sb.append("w");
            else if(diff == -10) sb.append("a");
            else sb.append("d");
        }
        
        return sb.toString();
        
    }
}