// Last updated: 8/11/2026, 8:47:15 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int i;
        int n = nums.length;
        int ans[] = new int[2*n];
        for( i =0 ; i < nums.length; i ++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}