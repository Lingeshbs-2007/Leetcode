// Last updated: 9/11/2026, 9:27:17 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        int i , j;
        for( i = 0 ; i < nums.length ; i++){
            for( j = i+ 1 ; j < nums.length ; j++){
                  if(nums[i] == nums[j])
                      return nums[i];
            }
        }
        return nums[i];

    }
}