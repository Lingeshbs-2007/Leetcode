// Last updated: 8/11/2026, 8:53:03 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums1)
            m.put(num,1);
        for(int num : nums2){
            if(m.containsKey(num)){
                list.add(num);
                m.remove(num);
            }
        }  
        int ans[] = new int[list.size()];
        for(int i = 0 ; i < ans.length ; i++)
             ans[i] = list.get(i);
        return ans;       
    }
}