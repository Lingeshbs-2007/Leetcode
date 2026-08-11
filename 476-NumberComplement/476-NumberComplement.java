// Last updated: 8/11/2026, 8:51:36 PM
class Solution {
    public int findComplement(int num) {
        int temp = num ;
        int mask = 0;
        while( num > 0){
            mask = ( mask << 1) | 1;
            num >>= 1;
        }
        return mask^temp;
    }
}