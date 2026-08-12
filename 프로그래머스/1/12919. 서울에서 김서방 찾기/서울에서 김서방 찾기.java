class Solution {
    public String solution(String[] seoul) {
        int ans = 0;
        
        for(var s : seoul){
            if(s.equals("Kim")) return "김서방은 " + ans + "에 있다";
            ans++;
        }
        
        return "";
    }
}