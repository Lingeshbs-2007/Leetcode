// Last updated: 9/11/2026, 9:26:01 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int num : nums){
            if( num > max1){
                max2 = max1;
                max1 = num;
            }
            else if( num > max2)
               max2 = num;
        }
        return (max1-1)*(max2-1);
    }
}