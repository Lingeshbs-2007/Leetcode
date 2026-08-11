// Last updated: 8/11/2026, 8:44:16 PM
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