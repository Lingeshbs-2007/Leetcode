// Last updated: 8/11/2026, 8:43:45 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        long maxStrength = 0;
        for(int i = 0 ; i < nums.length ; i++){
            long strength = 0;
            for(int j = i+1 ; j < nums.length ; j++){
                 int a = nums[i];
                 int b = nums[j];
                 while(b != 0){
                     int temp = b;
                     b = a % b;
                     a = temp;
                 }
                 int gcd = a;
                 strength = (1L * nums[i]*nums[j]) / (1L*gcd*gcd);
            if( strength > maxStrength)
                maxStrength = strength;
            }
        }
        return maxStrength;
    }
}