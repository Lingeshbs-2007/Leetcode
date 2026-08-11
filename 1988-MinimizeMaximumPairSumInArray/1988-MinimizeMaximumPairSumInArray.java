// Last updated: 8/11/2026, 8:47:19 PM
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