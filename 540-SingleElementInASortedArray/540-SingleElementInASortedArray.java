// Last updated: 8/11/2026, 8:51:21 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
         int X = 0 , i;
         for( i = 0 ; i < nums.length ; i++){
              X = X ^ nums[i];
         }
         return X;

    }
}