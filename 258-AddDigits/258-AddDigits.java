// Last updated: 8/11/2026, 8:54:01 PM
class Solution {
    public int addDigits(int num) {
        
        while(num >= 10){
            int sum = 0 , d;
        while( num > 0){
             d = num % 10;
             sum += d;
             num = num / 10;
        }
        num = sum;
        } 
        return num;
    }
}