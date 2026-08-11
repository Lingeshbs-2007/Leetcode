// Last updated: 8/11/2026, 8:47:50 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i , j , count = 0;
        for( i = 0 ; i < nums.length ; i++){
            for( j = i+1 ; j < nums.length ; j++){
                if( nums[i] == nums[j])
                     count++;
            }
        }
        return count;
    }
}