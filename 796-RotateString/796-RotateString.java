// Last updated: 9/11/2026, 9:29:20 AM
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