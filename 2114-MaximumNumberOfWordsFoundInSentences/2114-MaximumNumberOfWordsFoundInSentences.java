// Last updated: 9/11/2026, 9:24:56 AM
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