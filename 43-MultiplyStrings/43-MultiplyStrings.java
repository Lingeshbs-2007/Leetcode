// Last updated: 8/11/2026, 8:58:14 PM
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c  = a.multiply(b);
        return c.toString();
    }
}