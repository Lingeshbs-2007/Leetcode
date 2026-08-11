// Last updated: 8/11/2026, 8:46:12 PM
class Solution {
    public int countDigits(int num) {
        int count = 0 , d;
        int temp = num;
        while( num != 0){
            d = num % 10;
            if( temp % d == 0)
                 count++;
            num = num / 10;     
        }
        return count;
    }
}