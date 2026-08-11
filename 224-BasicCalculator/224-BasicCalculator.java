// Last updated: 8/11/2026, 8:54:31 PM
class Solution {
    public int calculate(String s) {
        int result = 0;
        int number = 0;
        int sign = 1;
        Stack<Integer> st = new Stack<>();
        for(int i = 0  ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = number*10 +(ch - '0');
            }
            else if( ch == '+'){
                result += sign*number;
                number = 0;
                sign = 1;
            }
            else if( ch == '-'){
                result += sign *number;
                number = 0;
                sign = -1;
            }
            else if( ch == '('){
                st.push(result);
                st.push(sign);
                result = 0;
                number = 0;
                sign = 1;
            }
            else if( ch == ')'){
                result += sign*number;
                number = 0;
                int previousSign = st.pop();
                int previousResult = st.pop();
                result = previousResult + previousSign * result;
            }
        }
        result += sign * number;
        return result;
    }
}