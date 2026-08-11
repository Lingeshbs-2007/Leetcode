// Last updated: 8/11/2026, 8:56:05 PM
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1)
            return nums[0];  
        int maxProduct = nums[0];    
        for(int i = 0 ; i < nums.length ; i++){
            int product = 1;
            for(int j = i ; j < nums.length ; j++){
                product *= nums[j];
            
            if(maxProduct < product)
                maxProduct = product;
            }  
        }   
        return maxProduct; 
    }
}