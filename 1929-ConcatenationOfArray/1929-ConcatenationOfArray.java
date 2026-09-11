// Last updated: 9/11/2026, 9:25:15 AM
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