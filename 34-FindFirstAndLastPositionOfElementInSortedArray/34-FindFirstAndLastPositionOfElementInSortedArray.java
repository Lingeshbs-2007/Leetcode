// Last updated: 8/11/2026, 8:58:28 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
           int arr[] = new int[2];
           arr[0] = -1 ;
           arr[1] = -1;
           int st = 0 , end = nums.length-1;
           while( st <= end){
               if( nums[st] == target){
                     arr[0] = st;
                     break;
               }      
               st++;      
           }
           while( end >= 0){
               if( nums[end] == target){
                     arr[1] = end;
                     break;
               }      
               end--;      
           }
           return arr;
    }
}