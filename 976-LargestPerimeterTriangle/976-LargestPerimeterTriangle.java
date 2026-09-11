// Last updated: 9/11/2026, 9:27:00 AM
class Solution {
    public int largestPerimeter(int[] nums) {
        int i , j;
        int n = nums.length;
        for( i = 0 ; i < n ; i++){
             for( j = i+1 ; j < n ; j++){
                if( nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
             }
        }
         for( i = n - 1; i >= 2 ; i--){
            if( nums[i- 1] + nums[i - 2] > nums[i])
                return  nums[i - 1] + nums[i - 2 ] + nums[i];
            
        }
        return 0;
    }
}