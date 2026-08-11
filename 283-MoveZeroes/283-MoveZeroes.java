// Last updated: 8/11/2026, 8:53:48 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int i , front =0;
        int n = nums.length;
        for( i = 0; i < n ; i++){
            if( nums[i] != 0){
                nums[front] = nums[i];
                front++;
            }            
        }
        for( i = front; i < n; i++){
            nums[i] = 0;
        }
         for( i = 0; i < n ; i++){
            System.out.print(nums[i] + ",");
        }
        
    }
}