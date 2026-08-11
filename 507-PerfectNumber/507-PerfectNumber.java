// Last updated: 8/11/2026, 8:51:30 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
         int i , sum = 0;
         for( i =1 ; i < num ; i++){
            if( num % i == 0)
                sum += i ;
         }
         if ( sum == num )
             return true;
         else
             return false;    

    }
}