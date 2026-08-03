class Solution {
    public int solution(String str1, String str2) {
        
        //substirng의 index에 관련된
        
        int n = str2.length();
        
        for(int i = 0 ; i < n; i++){
            String tmp = str2.substring(i,n);
            
            if(tmp.startsWith(str1)) return 1;
        }
        
        return 0;
    }
}