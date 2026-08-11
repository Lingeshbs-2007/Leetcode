// Last updated: 8/11/2026, 8:46:53 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = 0 , rev2 = 0, temp , d;
        temp  = num ;
        while ( num != 0){
              d = num % 10;
              rev1 = rev1*10+d;
              num = num / 10;
        }
        while ( rev1 != 0){
            d = rev1 % 10;
            rev2 =  rev2*10+d;
            rev1 = rev1 / 10;
        }
        if( rev2 == temp)
             return true;
        else
             return false;     
    }
}