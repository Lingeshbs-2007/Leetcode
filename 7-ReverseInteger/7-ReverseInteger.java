// Last updated: 8/11/2026, 8:58:52 PM
class Solution {
    public int reverse(int x) {
        int d  ;
        long rev = 0;
        while( x != 0){
            d = x % 10;
            rev = rev*10+d;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
            x = x / 10;
        }
        return (int)rev;
    }
}