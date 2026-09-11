// Last updated: 9/11/2026, 9:26:58 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
         int i;
         for( i = 0 ; i < nums.length ; i++){
              nums[i] *= nums[i];
         }
         Arrays.sort(nums);
         return nums;
    }
}