// Last updated: 9/11/2026, 9:25:17 AM
class Solution {
    public int minPairSum(int[] nums) {
         Arrays.sort(nums);
         int st = 0 , end  = nums.length - 1;
         int maxSum = 0 , sum =0;
         while( st < end){
             sum = nums[st] + nums[end];
             if( sum > maxSum)
                 maxSum = sum;
             st++;
             end--;
         }

         return maxSum;     
    }
}