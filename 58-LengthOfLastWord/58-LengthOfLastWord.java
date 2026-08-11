// Last updated: 8/11/2026, 8:57:31 PM
class Solution {
    public int lengthOfLastWord(String s) {
       int count = 0;
       int i = s.length() - 1;
       while( i >= 0 && s.charAt(i) == ' '){
             i--;

       }
       while( i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
       }
    return count;    

    }
   
}