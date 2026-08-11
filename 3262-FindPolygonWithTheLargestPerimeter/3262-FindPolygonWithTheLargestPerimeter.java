// Last updated: 8/11/2026, 8:44:51 PM
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for(int i = 0 ; i < n ; i++)
            sum += nums[i];
        for(int i = n-1 ; i >= 2 ; i--){
            int largest = nums[i];
            if( largest < sum - largest)
               return sum;
            else{
                sum = sum - largest;
            }    
        }
       return -1;
    }
}