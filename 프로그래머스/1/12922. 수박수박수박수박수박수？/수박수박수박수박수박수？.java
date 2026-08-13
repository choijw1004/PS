class Solution {
    public String solution(int n) {
        String[] tmp = {"수", "박"};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        while(n -- >0){
            sb.append(tmp[i % 2]);
            
            i++;
        }
        
        return sb.toString();
    }
}