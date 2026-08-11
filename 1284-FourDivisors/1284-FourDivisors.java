// Last updated: 8/11/2026, 8:48:40 PM
class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int sum =0 ,i;
        for(  i = 0 ; i < n ; i++){
            int count = 0 , tempSum = 0;
            for( int j = 1 ; j <= nums[i] ; j++){
              if( nums[i] % j == 0){
                   count++;
                   tempSum += j;
              }
              if( count > 4)
                  break;
            }  
            if( count == 4)
                sum += tempSum;
         }
         return sum;
    }
}