// Last updated: 8/11/2026, 8:48:29 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];

        for (int num : arr) {
            freq[num + 1000]++;
        }

        boolean[] seen = new boolean[1001];

        for (int count : freq) {
            if (count > 0) {
                if (seen[count]) {
                    return false;
                }
                seen[count] = true;
            }
        }

        return true;
    }
}