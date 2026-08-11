// Last updated: 8/11/2026, 8:44:07 PM
class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int d = n % 10;

            if (d != 0) {
                sum += d;
                sb.append(d);
            }

            n /= 10;
        }

        if (sb.length() == 0)
            return 0;

        sb.reverse();
        long x = Long.parseLong(sb.toString());

        return x * sum;
    }
}