// Last updated: 8/11/2026, 8:51:47 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int res = x^y;
        int count = 0;
        while( res > 0){
            if((res & 1) == 1)
               count++;
            res = res >> 1;   
        }
        return count;
    }
}