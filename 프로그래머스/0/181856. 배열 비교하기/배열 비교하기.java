class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int s1 = 0;
        int s2 = 0;
        
        for(var n : arr1){
            s1 += n;
        }
        
        for(var n : arr2){
            s2 += n;
        }
        
        
        if(n1 != n2) {
            if(n1 > n2) return 1;
            
            if(n2 > n1) return -1;
        }
        
        if(s1 > s2) return 1;
        
        if(s2 > s1) return -1;
        
        return 0;
    }
}