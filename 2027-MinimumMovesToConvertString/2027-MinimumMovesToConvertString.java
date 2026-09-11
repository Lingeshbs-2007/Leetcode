// Last updated: 9/11/2026, 9:25:01 AM
class Solution {
    public int minimumMoves(String s) {
        int i = 0;
        int count = 0;
        while( i < s.length()){
            if( s.charAt(i) == 'X'){
                i += 3;
                count++;
            }
            else
               i++;
        }
        return count;
    }
}