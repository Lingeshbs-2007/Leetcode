// Last updated: 9/11/2026, 9:32:34 AM
class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int k = 1; k < n; k++) {

            StringBuilder ans = new StringBuilder();

            int i = 0;

            while (i < s.length()) {

                int count = 1;

                while (i + 1 < s.length() &&
                       s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                    i++;
                }

                ans.append(count);
                ans.append(s.charAt(i));

                i++;
            }

            s = ans.toString();
        }

        return s;
    }
}