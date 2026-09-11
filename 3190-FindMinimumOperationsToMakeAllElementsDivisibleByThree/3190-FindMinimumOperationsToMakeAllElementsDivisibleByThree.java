// Last updated: 9/11/2026, 9:22:53 AM
class Solution {
    public int minimumOperations(int[] nums) {
          int count = 0 ;
          for( int ele : nums){
            if( ele % 3 != 0 )
                  count++;      
          } 
          return count;
    }
}