// Last updated: 8/11/2026, 8:44:24 PM
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