class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        
        int start = a;
        
        for(int i = 0 ; i < included.length; i++){
            
            if(included[i]) sum += start;

            start += d;
            System.out.println(start);
        }
        
        return sum;
    }
}