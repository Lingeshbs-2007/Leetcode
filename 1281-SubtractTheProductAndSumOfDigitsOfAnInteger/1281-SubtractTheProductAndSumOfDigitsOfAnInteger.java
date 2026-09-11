// Last updated: 9/11/2026, 9:26:23 AM
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