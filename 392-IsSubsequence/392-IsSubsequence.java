// Last updated: 8/11/2026, 8:52:31 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
         int st = 0 , end = 0;
         char c[] = s.toCharArray();
         char ch[] = t.toCharArray();
         while( st < c.length && end < ch.length){
              if( c[st] == ch[end]){
                  st++;
              }
             end++;
         }
        return st == c.length;
    }
}