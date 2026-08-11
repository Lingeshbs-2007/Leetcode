// Last updated: 8/11/2026, 8:48:07 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
         for( int i = 0; i < n ; i++){
            int count = 0;
            for( int j = 0; j < n ; j++){
                 if( nums[i] > nums[j] && nums[i] != nums[j])
                       count++;
                       arr[i] = count;
            }
                      
         }
         return arr;
    }
}