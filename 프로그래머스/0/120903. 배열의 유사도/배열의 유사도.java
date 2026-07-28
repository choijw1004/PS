class Solution {
    public int solution(String[] s1, String[] s2) {
        int ans = 0;
        
        for(var v1 : s1){
            for(var v2 : s2 ){
                if(v1.equals(v2)) ans++;
            }
        }
        
        return ans;
    }
}