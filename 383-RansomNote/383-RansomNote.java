// Last updated: 8/11/2026, 8:52:49 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> m = new HashMap<>();
        for(int i = 0 ; i < magazine.length() ; i++){
            m.put(magazine.charAt(i) , m.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i = 0 ; i < ransomNote.length() ; i++){
             char ch =  ransomNote.charAt(i);
             if(!m.containsKey(ch) || m.get(ch) == 0)
                 return false;
             else
                 m.put(ch,m.get(ch)-1);    
        }
        return true;
    }
}