class Solution {
    public int solution(String str1, String str2) {
        int targetLength = str2.length();
        int n = str1.length();
        
        for(int i = 0 ; i <= n - targetLength; i++){
            String tmp = str1.substring(i, i + targetLength);
            
            if(tmp.equals(str2)) return 1;
        }
        
        return 2;
    }
}