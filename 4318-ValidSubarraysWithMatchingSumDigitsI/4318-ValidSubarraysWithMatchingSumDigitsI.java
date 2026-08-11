// Last updated: 8/11/2026, 8:44:04 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            long sum = 0 ;
            for(int j = i ; j < nums.length ; j++){
                  sum += nums[j];
                  long temp = Math.abs(sum);
                  long firstDigit = temp;
                  long lastDigit = temp % 10;
                  while(firstDigit >= 10){
                      firstDigit /= 10;
                  }
                if( firstDigit == x && lastDigit == x)
                      count++;
            }
        }
        return count;
        
    }
}