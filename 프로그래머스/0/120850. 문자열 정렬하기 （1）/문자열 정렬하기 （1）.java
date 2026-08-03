import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for(var c : my_string.toCharArray()){
            if(Character.isDigit(c)) list.add(c - '0');
        }
        
        return list.stream().mapToInt(i -> i).sorted().toArray();
    }
}