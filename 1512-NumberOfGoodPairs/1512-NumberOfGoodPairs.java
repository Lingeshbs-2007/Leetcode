// Last updated: 9/11/2026, 9:25:50 AM
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