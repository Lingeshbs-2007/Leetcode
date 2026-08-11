// Last updated: 8/11/2026, 8:49:38 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int st = 0;
        int end = nums.length-1;
        for(int i = 0 ; i < nums.length ; i++){
            if( nums[i] % 2 == 0){
                res[st] = nums[i];
                st++;
            }
            else{
                res[end] = nums[i];
                end--;
            }
        }
        return res;
    }
}