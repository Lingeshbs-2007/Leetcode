// Last updated: 8/11/2026, 8:47:55 PM
class Solution {
    public int[] runningSum(int[] nums) {
       int n = nums.length;
       int i = 0,j ;
       int rn[] = new int[n];
            rn[i] = nums[i];
       for( i = 0; i < n ; i++){     
       for( j = i+1 ; j < n ; j++){
             rn[j] = rn[i] + nums[j];

          }
    } 
       return rn;
    }
}