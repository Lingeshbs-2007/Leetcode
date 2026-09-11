// Last updated: 9/11/2026, 9:26:38 AM
class Solution {
    public int tribonacci(int n) {
       if( n == 0)
           return 0;
        if(n == 1)
           return 1;
        int n1 = 0 , n2 = 1 , n3 = 1 , n4=0 ,i;   
        for( i = 3 ; i <= n; i++){
            n4 = n1+n2+n3;
            n1 = n2;
            n2 = n3;
            n3 = n4;
        }       
        return n3;
    }
}