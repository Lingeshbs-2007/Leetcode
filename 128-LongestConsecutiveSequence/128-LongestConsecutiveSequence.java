// Last updated: 8/11/2026, 8:56:39 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int maxLen = 0;
        for(int x : s){
            if(!s.contains(x-1)){
                int current = x;
                int len = 1;
                while(s.contains(current+1)){
                    current++;
                    len++;
                }
                 maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}