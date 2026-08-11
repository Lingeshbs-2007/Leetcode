// Last updated: 8/11/2026, 8:52:04 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        for(int i = 1 ; i <= nums.length ; i++){
            if(!s.contains(i))
                l.add(i);
        }
        return l;
    }
}