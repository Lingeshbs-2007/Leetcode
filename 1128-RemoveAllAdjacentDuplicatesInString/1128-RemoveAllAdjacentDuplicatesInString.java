// Last updated: 8/11/2026, 8:48:52 PM
class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> s1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char arr[] = s.toCharArray();
        for( char ch : arr){
            if(s1.isEmpty())
               s1.push(ch);
            else if( s1.peek() == ch)
                s1.pop();
            else
                s1.push(ch);
        }
        for( char ele : s1){
            sb.append(ele);
        }
        String str = sb.toString();
        return str;
    }
}