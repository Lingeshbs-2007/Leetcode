// Last updated: 8/11/2026, 8:52:27 PM
class Solution {
    public int countSegments(String s) {
        String array[] = s.split(" ");
        int count = 0;
        for(String s1 : array){
            if(!s1.isEmpty())
               count++;
        }
        return count;   
    }
}