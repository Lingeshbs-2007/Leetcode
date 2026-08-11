// Last updated: 8/11/2026, 8:49:21 PM
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