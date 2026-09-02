// Last updated: 9/2/2026, 9:43:58 AM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String v1[] = version1.split("\\.");
4        String v2[] = version2.split("\\.");
5        int n = Math.max(v1.length , v2.length);
6        for(int i = 0 ; i < n ; i++){
7            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
8            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
9            if(num1 > num2){
10                return 1;
11            }
12            else if(num1 < num2){
13                return -1;
14            }
15        }
16        return 0;
17    }
18}