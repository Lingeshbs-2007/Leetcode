// Last updated: 8/11/2026, 8:54:26 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
             m.put(num,m.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue() > n / 3)
                res.add(entry.getKey());
        }
        return res;
    }
}