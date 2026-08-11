// Last updated: 8/11/2026, 8:47:39 PM
class Solution {
    public String makeGood(String s) {
         Stack<Character> st = new Stack<>();
         for(int i = 0 ; i < s.length() ; i++){
             if(st.isEmpty())
                  st.push(s.charAt(i));
             else{
                if(Math.abs(s.charAt(i) - st.peek()) == 32)
                      st.pop();
                else
                      st.push(s.charAt(i));      
             }          
         }
         StringBuilder sb = new StringBuilder();
         for(char ch : st)
             sb.append(ch);
         return sb.toString();    
    }
}