// Last updated: 8/11/2026, 8:46:08 PM
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;

        if ((volume >= 1000000000L ||
             length >= 10000 ||
             width >= 10000 ||
             height >= 10000) && mass >= 100)
            return "Both";
        else if (mass >= 100)
            return "Heavy";
        else if (volume >= 1000000000L ||
                 length >= 10000 ||
                 width >= 10000 ||
                 height >= 10000)
            return "Bulky";

        return "Neither";
    }
}