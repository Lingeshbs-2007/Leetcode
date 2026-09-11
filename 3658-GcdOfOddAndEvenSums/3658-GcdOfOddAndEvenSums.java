// Last updated: 9/11/2026, 9:22:45 AM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n*n;
        int b = n*(n+1);
        while(b != 0){
            int temp = b;
            b =  a % b;
            a = temp;
        }
        return a;
    }
}