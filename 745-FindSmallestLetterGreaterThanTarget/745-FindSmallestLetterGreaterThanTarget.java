// Last updated: 8/11/2026, 8:50:17 PM
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