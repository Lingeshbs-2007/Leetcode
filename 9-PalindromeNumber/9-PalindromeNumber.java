// Last updated: 8/11/2026, 8:58:47 PM
class Solution {
    public boolean isPalindrome(int x) {
        int d , rev = 0 , temp;
        temp = x;
        while( x != 0 && x > 0){
            d = x % 10;
            rev = rev*10+d;
            x = x /10;
        }
        if( rev == temp )
             return true;
        else
            return false;     
    }
}