// Last updated: 9/11/2026, 9:29:48 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        boolean flag = false;
        for(char ch : letters){
            if(!flag){
                if( ch > target){
                    res = ch;
                    flag = true;
                }
            }
            else{
                if( ch < res && ch > target)
                   res = ch;
            }
        }
        return res;
    }
}