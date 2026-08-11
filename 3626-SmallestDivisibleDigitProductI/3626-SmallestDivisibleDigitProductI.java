// Last updated: 8/11/2026, 8:44:17 PM
class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int product = 1;
            int temp = n;
            while( temp != 0){
                product *= temp % 10;
                temp = temp / 10;
            }
            if( product % t == 0)
                 return n;
            n++;     
        }
    }
}