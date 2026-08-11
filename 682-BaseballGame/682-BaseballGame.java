// Last updated: 8/11/2026, 8:50:42 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String ch : operations){
            // int val = Integer.parseInt(ch);
        
            if( ch.equals("C"))
                  st.pop();     
            else if(ch.equals("D")){
                st.push(2*st.peek());
            }
            else if(ch.equals("+")){
                int x  = st.pop();
                int y = st.pop();
                int res = x+y;
                st.push(y);
                st.push(x);
                st.push(res);
            }       
            else
               st.push(Integer.parseInt(ch));   
        }
        int sum = 0;
        for( int i : st){
            sum += i;
        }
        return sum;
    }
}