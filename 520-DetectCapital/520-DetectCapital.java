// Last updated: 8/11/2026, 8:51:26 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
               upperCount++;
        }
        if(upperCount == word.length())
            return true;
        if(upperCount == 0)
            return true;
        if(upperCount == 1 && Character.isUpperCase(word.charAt(0)))
            return true;        
        return false;
    }
}