// Last updated: 8/11/2026, 8:53:28 PM
class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0] = 0;
        for(int i = 1 ; i <= n ; i++){
            ans[i] = ans[i/2] + (i%2);
        }
        return ans;
    }
}