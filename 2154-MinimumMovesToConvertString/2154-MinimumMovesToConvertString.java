// Last updated: 8/11/2026, 8:47:04 PM
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