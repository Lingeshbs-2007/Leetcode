// Last updated: 8/11/2026, 8:54:33 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length  ;i++){
              if(set.contains(nums[i]))
                  return true;
              set.add(nums[i]);   
              if(set.size() > k)
                  set.remove(nums[i-k]); 
        }
        return false;
    }
}