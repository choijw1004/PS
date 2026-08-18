class Solution {

    public String[] solution(String[] str_list) {
        int n = str_list.length;

        for (int i = 0; i < n; i++) {
            String s = str_list[i];

            if (s.equals("l")) {
                String[] ans = new String[i];

                for (int j = 0; j < i; j++) {
                    ans[j] = str_list[j];
                }

                return ans;
            }

            if (s.equals("r")) {
                String[] ans = new String[n - i - 1];

                for (int j = i + 1; j < n; j++) {
                    ans[j - i - 1] = str_list[j];
                }

                return ans;
            }
        }

        return new String[0];
    }
}