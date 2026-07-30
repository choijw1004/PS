class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        
        sb.append(as);
        sb.append(bs);
        
        int tmp = Integer.parseInt(sb.toString());
        
        if(tmp > 2 * a * b) return tmp;
        else if(tmp == 2* a * b) return tmp;
        else return 2 * a * b;
    }
}