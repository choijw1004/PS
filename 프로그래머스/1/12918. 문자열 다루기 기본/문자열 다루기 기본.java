class Solution {
    public boolean solution(String s) {
        int n = s.length();
        
        if(n != 4 && n != 6) return false;
        
        for(var c : s.toCharArray()){
            if(Character.isAlphabetic(c)) return false;
        }
        
        return true;
    }
}