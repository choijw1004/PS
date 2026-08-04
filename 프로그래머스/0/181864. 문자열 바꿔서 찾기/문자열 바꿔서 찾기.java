class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for(var c : myString.toCharArray()){
            if(c == 'A') sb.append("B");
            else sb.append("A");
        }
        
        String str = sb.toString();
        
        
        //배열 탐색
        for(int i = 0 ; i <= myString.length() - pat.length(); i++){
            StringBuilder tmp = new StringBuilder();
            
            for(int j = i; j < i + pat.length(); j++){
                tmp.append(str.charAt(j));
            }
            
            System.out.println(tmp.toString());
            if(tmp.toString().equals(pat)) return 1;
        }
        return 0;
    }
}