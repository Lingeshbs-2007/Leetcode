// Last updated: 9/11/2026, 9:23:32 AM
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> s = new HashSet<>();
        int count = 0;
        for(String word : words){
            String rev = ""+word.charAt(1)+word.charAt(0);
            if(s.contains(rev))
                count++;
            else
                s.add(word);
        }
        return count;
    }
}