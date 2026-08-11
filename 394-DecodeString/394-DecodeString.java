// Last updated: 8/11/2026, 8:52:29 PM
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numSt = new Stack<>();
        Stack<String> st = new Stack<>();
        int num = 0;
        String str = "";
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch))
                 num = num * 10 + ch - '0';
            else if(Character.isAlphabetic(ch))
                 str += ch;
            else if(ch == '['){
                numSt.push(num);
                st.push(str);
                num = 0;
                str = "";
            }     
            else{
                StringBuilder temp = new StringBuilder();
                int t = numSt.pop();
                for(int i = 0 ; i <  t; i++)
                     temp.append(str);
                str = st.pop() + temp.toString();     
            }
        }
        return str;
    }
}