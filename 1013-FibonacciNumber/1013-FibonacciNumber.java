// Last updated: 8/11/2026, 8:49:20 PM
class Solution {
    public int fib(int n) {
        if ( n == 0)
            return 0;
        if( n == 1)
            return 1;    
        int n1 =0 , n2 = 1 ,n3 = 0, i ;
        for( i = 2; i <= n ; i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}