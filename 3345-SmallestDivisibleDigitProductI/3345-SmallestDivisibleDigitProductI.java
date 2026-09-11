// Last updated: 9/11/2026, 9:22:48 AM
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