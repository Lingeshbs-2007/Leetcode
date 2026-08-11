// Last updated: 8/11/2026, 8:52:37 PM
class Solution {
    public char findTheDifference(String s, String t) {
          char ch[] = s.toCharArray();
          char c[] = t.toCharArray();
          char s1= 0;
          for( int i = 0 ; i < t.length() ; i++){
               s1 ^= c[i];
          }  
          for( int i = 0 ; i < s.length() ; i++){
               s1 ^= ch[i];
          }  
          return s1;
    }
}