// Last updated: 8/11/2026, 8:55:26 PM
class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length;
         int st = 0 , end = nums.length - 1;
         while( st < end){
              int temp = nums[st];
              nums[st] = nums[end];
              nums[end] = temp;
             st++;
             end--; 

         }
         st = 0;
         end = k - 1;
         while( st < end){
              int temp = nums[st];
              nums[st] = nums[end];
              nums[end] = temp;
             st++;
             end--; 

         }
         st = k ;
         end = nums.length - 1;
         while( st < end){
              int temp = nums[st];
              nums[st] = nums[end];
              nums[end] = temp;
             st++;
             end--; 

         }
         for( int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i]+",");
         }
    }
}