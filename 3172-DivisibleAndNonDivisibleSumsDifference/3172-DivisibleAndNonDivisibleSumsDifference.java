// Last updated: 8/11/2026, 8:45:05 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int c1 = 0;
        int c2 = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i  % m == 0)
                c1 += i;
            else
                c2 += i;    
        }
        return c2 - c1 ;
    }
}