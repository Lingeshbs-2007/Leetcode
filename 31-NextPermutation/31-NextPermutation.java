// Last updated: 8/11/2026, 8:58:31 PM
class Solution {
    public void nextPermutation(int[] nums) {
         int n = nums.length;
         int i = n - 2;
         int k ;
         while( i >= 0 && nums[i] >= nums[i+1]){
              i--;
         }
         if( i == -1){
            int st = 0 ,  end = n-1;
            while( st < end ){
                 int temp = nums[st];
                 nums[st] = nums[end];
                 nums[end] = temp;

               st++;
               end--;  
            }
            for( k = 0 ; k < n ; k++){
                 System.out.print(nums[k]);
            }
         }
         else{
             int j = n-1;
             while( nums[j] <= nums[i]){
                 j--;
             }
             int temp1 = nums[i];
             nums[i] = nums[j];
             nums[j] = temp1;

             int left = i+1 , right = n-1;
             while( left < right){
                  int temp2 = nums[left];
                  nums[left] = nums[right];
                  nums[right] = temp2;

                 left++;
                 right--; 
             }
         }
         for( k = 0 ; k < n ; k++){
            System.out.print(nums[k]);
         }
    }
}