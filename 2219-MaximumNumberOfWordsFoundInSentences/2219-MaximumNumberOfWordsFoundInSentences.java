// Last updated: 8/11/2026, 8:46:56 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
         int i ;
         int maxcount = 1;
         for( i = 0 ; i < sentences.length ; i++){
              String s = sentences[i];
              int count = 1;
              char arr[] = s.toCharArray();
              for( char ch : arr){
                   if( ch == ' ')
                       count++;
              }
              if( count > maxcount)
                   maxcount = count;

         }
         return maxcount;
         
    }
}