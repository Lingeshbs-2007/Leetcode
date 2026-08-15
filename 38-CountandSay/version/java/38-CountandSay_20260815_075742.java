// Last updated: 8/15/2026, 7:57:42 AM
1class Solution {
2    public String countAndSay(int n) {
3
4        String s = "1";
5
6        for (int k = 1; k < n; k++) {
7
8            StringBuilder ans = new StringBuilder();
9
10            int i = 0;
11
12            while (i < s.length()) {
13
14                int count = 1;
15
16                while (i + 1 < s.length() &&
17                       s.charAt(i) == s.charAt(i + 1)) {
18                    count++;
19                    i++;
20                }
21
22                ans.append(count);
23                ans.append(s.charAt(i));
24
25                i++;
26            }
27
28            s = ans.toString();
29        }
30
31        return s;
32    }
33}