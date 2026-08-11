class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (int i = s; i <= e; i++) {
            sb.append(my_string.charAt(i));
        }
        sb.reverse();

        for (int i = 0; i < s; i++) {
            ans.append(my_string.charAt(i));
        }
        ans.append(sb);
        for (int j = e + 1; j < my_string.length(); j++) {
            ans.append(my_string.charAt(j));
        }

        return ans.toString();
    }
}