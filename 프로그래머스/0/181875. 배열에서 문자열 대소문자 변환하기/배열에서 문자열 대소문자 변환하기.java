class Solution {
    public String[] solution(String[] strArr) {
        int n = strArr.length;
        
        for(int i = 0 ; i < n; i++){
            String tmp = strArr[i];
            
            if(i % 2 == 0) strArr[i] = tmp.toLowerCase();
            else strArr[i] = tmp.toUpperCase();
        }
        
        return strArr;
    }
}