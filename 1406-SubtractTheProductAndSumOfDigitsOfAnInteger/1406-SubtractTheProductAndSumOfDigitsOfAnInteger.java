// Last updated: 8/11/2026, 8:48:23 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int pr = 1 , sum = 0, d;
        while( n != 0){
            d =n % 10;
            pr *= d;
            sum += d;
            n = n / 10;
        }
        return pr-sum;
    }
}