// Last updated: 8/11/2026, 8:43:48 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        if( (start[0] + start[1]) % 2 == (target[0] + target[1]) % 2 )
               return true;
        return false;
    }
}