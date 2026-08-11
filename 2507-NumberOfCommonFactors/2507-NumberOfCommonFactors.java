// Last updated: 8/11/2026, 8:46:20 PM
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