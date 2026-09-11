// Last updated: 9/11/2026, 9:22:07 AM
class Solution {
    public int countSpecialIntegers(int[] nums) {
        boolean[] seen = new boolean[101];
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                if(seen[nums[i]]){
                    continue;
                }
                seen[nums[i]] = true;
                boolean special = true;
                for(int j = i + 1 ; j < nums.length ; j++){
                    if(nums[j] == nums[i] && nums[j-1] != nums[i]){
                        special = false;
                        break;
                    }
                }
                if(special)
                      ans++;
            }
        }
        return ans;
    }
}