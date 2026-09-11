// Last updated: 9/11/2026, 9:24:28 AM
class Solution {
    public int commonFactors(int a, int b) {
        int  i , count = 0;
        for( i = 1 ; i <= (a+b)/2 ; i++){
            if( a % i == 0 && b % i == 0)
                   count++;
        }
        return count;
    }
}