// Last updated: 8/11/2026, 8:58:16 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while( i < n){
            int correctIndex = nums[i] -1;
            if(  nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]){
                 int temp = nums[i];
                 nums[i] = nums[correctIndex];
                 nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 1 ; j <= n ; j++){
            if( nums[j-1] == j)
               continue;
            return j;   
        }
        return n+1;
    }
}