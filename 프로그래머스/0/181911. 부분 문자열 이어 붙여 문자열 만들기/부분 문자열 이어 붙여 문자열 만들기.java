class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        int n = my_strings.length;
        
        for(int i = 0; i < n; i++){
            int start = parts[i][0];
            int end = parts[i][1];
            String tmp = my_strings[i].substring(start, end + 1);
            sb.append(tmp);
        }
        
        return sb.toString();
    }
}