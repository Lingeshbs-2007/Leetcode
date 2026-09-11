// Last updated: 9/11/2026, 9:24:31 AM
class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}