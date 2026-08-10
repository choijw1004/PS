class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String str = s.toUpperCase();
        
        int a = 0;
        int b = 0;
        
        for(var c : str.toCharArray()){
            if(c == 'P') a++;
            if(c == 'Y') b++;
        }
        
        if(a == 0 && b == 0) return true;
        if(a == b) return true;
        
        return false;
        
    }
}