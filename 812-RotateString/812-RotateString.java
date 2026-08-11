// Last updated: 8/11/2026, 8:49:51 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
             return false;
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i < s.length() ; i++){
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            if(sb.toString().equals(goal))
               return true;
        }
        return false;
    }
}