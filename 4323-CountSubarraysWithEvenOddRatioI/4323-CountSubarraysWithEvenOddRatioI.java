// Last updated: 8/11/2026, 8:44:02 PM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count = 0 ;
        for(int i = 0 ;i < nums.length ; i++){
            int even = 0;
            int odd = 0 ;
            for(int j = i ; j < nums.length ; j++){
                if(nums[j] % 2 == 0)
                    even++;
                else
                    odd++;
                if( odd > 0 && even*b <= a*odd){
                    count++;
                }
            }
        }
        return count;
    }
}