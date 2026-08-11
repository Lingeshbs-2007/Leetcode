// Last updated: 8/11/2026, 8:51:13 PM
class Solution {
    public String reverseWords(String s) {
        String words[] = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }
}