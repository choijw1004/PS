class Solution {
    public int solution(long n) {
        long fac = 1;
        int i = 1;
        while (fac * (i + 1) <= n) {
            i++;
            fac *= i;
        }
        return i;
    }
}