// Last updated: 8/11/2026, 8:48:16 PM
class Solution {
    public int removePalindromeSub(String s) {
        if(s.length() == 0)
           return 0;
        int st = 0;
        int end = s.length() - 1;
        while( st < end){
            if( s.charAt(st) != s.charAt(end))
                 return 2;
            st++;
            end--;     
        }   
        return 1;
    }
}