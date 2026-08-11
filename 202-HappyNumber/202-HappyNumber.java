// Last updated: 8/11/2026, 8:55:06 PM
class Solution {
    public boolean isHappy(int n) {
        int sum , d;
        while( n != 1 && n != 4){
            sum = 0 ;
            while( n != 0){
                d = n % 10;
                sum += d*d;
                n = n / 10;
            }
            n = sum ;
        }
        if( n == 1)
            return true;
        else
            return false;    
    }
}