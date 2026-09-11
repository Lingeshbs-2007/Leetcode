// Last updated: 9/11/2026, 9:25:09 AM
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int arr[] = new int[nums[n-1]];
        for(int i = 1; i <= nums[n-1] ; i++){
             if( nums[0] % i == 0 && nums[n-1] % i == 0){
                    arr[i-1] = i;
             }
        }
        Arrays.sort(arr);
        return arr[nums[n-1] - 1];
    }
}