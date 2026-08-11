// Last updated: 8/11/2026, 8:52:56 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int i, t = 0;
        for( i = 0 ; (long)i*i <= num ; i++){
            if( num == 1 || (long)i*i == num)
              t = 1 ;
        }
        if( t == 1)
            return true;
        else 
            return false;    
    }
}