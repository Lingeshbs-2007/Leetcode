// Last updated: 8/11/2026, 8:46:31 PM
class Solution {
    public char repeatedCharacter(String s) {
         char s1[] = s.toCharArray();
         int i , j;
         int minIndex = s1.length;
         char ans = 0;
        //  for(  i = 0 ; i < s1.length-1 ; i++){
        //      if( s1[i] == s1[i+1])
        //          return s1[i];     
        //  }
         for( i =0 ; i < s1.length ; i++ ){
            for( j = i+1 ; j < s1.length ; j++){
                 if( s1[i] == s1[j]){
                    if ( j < minIndex){
                        minIndex = j;
                        ans = s1[i];
                    }
                 }
                    
            }
         }
        return ans;
    }
}