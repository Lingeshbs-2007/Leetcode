// Last updated: 9/11/2026, 9:22:24 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length;
        for(int i = n -1 ; i >= n - k ; i--){
            if( mul > 1)
                  sum += (long) nums[i] * mul;
            else
                  sum += nums[i];
            mul--;
        }
        return sum;
    }
}