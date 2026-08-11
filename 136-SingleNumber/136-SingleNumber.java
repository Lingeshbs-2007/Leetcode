// Last updated: 8/11/2026, 8:56:38 PM
class Solution {
    public int singleNumber(int[] nums) {
        int X = 0 , i;
        for( i = 0; i < nums.length ; i++ ){
            X = X ^ nums[i];
        }
        return X;
    }
}