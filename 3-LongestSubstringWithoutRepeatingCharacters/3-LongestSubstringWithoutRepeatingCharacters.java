// Last updated: 8/11/2026, 8:59:04 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right = 0 ; right < s.length() ;right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}