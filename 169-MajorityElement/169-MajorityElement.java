// Last updated: 8/11/2026, 8:55:47 PM
class Solution {
    public int majorityElement(int[] nums) {
        //  Arrays.sort(nums);
        //  int n = nums.length;
        //  return nums[n/2];

        // int  x =0;
        // for(int i = 0; i < nums.length ; i++){
        //     int count = 0;
        //     for( int j = i+1 ; j < nums.length ; j++ ){
        //          if ( nums[i] == nums[j]){
        //              count++;
        //              if( count > nums.length / 2)
        //                  x = nums[i];
        //          }    
                     
        //     }
        // }
        // return x;
       
        int n = nums.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;   // reset for each element

            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                   return nums[i];
            }
        }

       return -1;
       
    }
}