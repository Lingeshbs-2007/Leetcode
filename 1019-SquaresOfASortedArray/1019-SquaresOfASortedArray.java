// Last updated: 8/11/2026, 8:49:08 PM
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