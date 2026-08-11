// Last updated: 8/11/2026, 8:54:44 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int ele : nums)
             s.add(ele);
        return s.size() != nums.length;     
    }
}