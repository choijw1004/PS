class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder ans = new StringBuilder();

        for (String s : str_list) {
            boolean found = false;

            for (int i = 0; i <= s.length() - ex.length(); i++) {
                if (s.startsWith(ex, i)) {
                    found = true;
                    break;
                }
            }

            if (!found) ans.append(s);
        }

        return ans.toString();
    }
}