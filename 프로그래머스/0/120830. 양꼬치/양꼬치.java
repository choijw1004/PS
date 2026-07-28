class Solution {
    public int solution(int n, int k) {
        int div = n / 10;
        
        return (n * 12000) + ((k - div)*(2000));
    }
}