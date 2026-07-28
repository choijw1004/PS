class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(var n : numbers){
            sum += n;
        }
       
        return (double)sum / numbers.length;
    }
}