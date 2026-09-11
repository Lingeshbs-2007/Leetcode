// Last updated: 9/11/2026, 9:22:21 AM
class Solution {
    public int largestInteger(int n, int s) {
        if( s == 0)
            return 0;
        if( s > 9*n)
            return -1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            int digit = Math.min(9,s);
            sb.append(digit);
            s -= digit;
        }
        return Integer.parseInt(sb.toString());
    }
}