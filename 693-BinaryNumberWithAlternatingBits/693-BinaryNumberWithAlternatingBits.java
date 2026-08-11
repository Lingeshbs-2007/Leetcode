// Last updated: 8/11/2026, 8:50:39 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        String binaryDigit = Integer.toBinaryString(n);
        for(int i = 1 ; i < binaryDigit.length() ; i++){
            if( binaryDigit.charAt(i) == binaryDigit.charAt(i-1))
                return false;
        }
        return true;
    }
}