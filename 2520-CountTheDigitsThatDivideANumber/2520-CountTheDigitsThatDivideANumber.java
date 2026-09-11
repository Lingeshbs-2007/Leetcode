// Last updated: 9/11/2026, 9:24:15 AM
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