// Last updated: 8/11/2026, 8:52:47 PM
class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[256];
        for( char ch : s.toCharArray())
             freq[ch]++;
        for( int i = 0 ; i < s.length() ; i++){
               char c = s.charAt(i);
               if( freq[c] == 1)
                   return i;
        }
        return -1;
    }
}