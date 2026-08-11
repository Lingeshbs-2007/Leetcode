// Last updated: 8/11/2026, 8:52:11 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(m.containsKey(num))
                m.put(num , m.get(num) +1);
            else
               m.put(num,1);
            if(m.get(num) == 2)
               list.add(num);       
        }
        return list;
    }
}