// Last updated: 8/11/2026, 8:50:54 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i = 1 ;  i <= n ; i++){
            if(m.containsKey(i)){
                if(m.get(i) == 2)
                   duplicate = i;
            }
            else{
                missing = i;
            }
        }
        return new int[]{duplicate,missing};
    }
}