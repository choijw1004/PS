class Solution {
    public int solution(String myString, String pat) {
        String t1 = myString.toLowerCase();
        String t2 = pat.toLowerCase();
        
        if(t1.contains(t2)) return 1;
        else return 0;
    }
}