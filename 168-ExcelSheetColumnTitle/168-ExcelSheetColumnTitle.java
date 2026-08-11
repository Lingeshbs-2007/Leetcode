// Last updated: 8/11/2026, 8:55:58 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            ans.append((char)('A' + rem));
            columnNumber = columnNumber / 26;
        }
        return ans.reverse().toString();
    }
}