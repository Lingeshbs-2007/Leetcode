// Last updated: 8/11/2026, 8:49:28 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;  //no of braces needed for close bracket
        for( char c: s.toCharArray()){
            if( c == '(')
                st.push(c);
            else{
                 if( st.isEmpty())
                    count++;
                 else
                    st.pop();   
            }    
           
        }
         return count+st.size();
    }
}