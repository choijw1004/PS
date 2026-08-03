class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(Integer.toString(a)).append(Integer.toString(b));
        sb2.append(Integer.toString(b)).append(Integer.toString(a));
        
        int a1 = Integer.parseInt(sb1.toString());
        int a2 = Integer.parseInt(sb2.toString());
        
        if(a1 >= a2) return a1;
        else return a2;
    }
}