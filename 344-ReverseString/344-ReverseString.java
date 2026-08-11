// Last updated: 8/11/2026, 8:53:22 PM
class Solution {
    public void reverseString(char[] s) {
        int st = 0 , end = s.length - 1;
        while( st < end){
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;

           st++;
           end--; 
        }
        for( int i = 0 ; i < s.length ; i++){
            System.out.print(s[i]);
        }
    }
}