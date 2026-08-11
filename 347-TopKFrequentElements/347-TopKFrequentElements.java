// Last updated: 8/11/2026, 8:53:15 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(m.entrySet());

        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));
        int res[] = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}