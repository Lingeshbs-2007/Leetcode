// Last updated: 8/11/2026, 8:53:58 PM
class Solution {
    public int missingNumber(int[] nums) {
        int i ,n = nums.length  , sum = 0;
        for(i = 0; i < n ; i++){
            sum += nums[i];
        }
        n = n*(n+1)/2;
        int x = n - sum ;
        return x;
    }
}