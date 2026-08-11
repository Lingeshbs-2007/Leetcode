// Last updated: 8/11/2026, 8:49:47 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '#')
                s1.push(s.charAt(i));
            else{
                 if( !s1.isEmpty())
                      s1.pop();  
            }
                 
        }
        for(int j = 0 ; j < t.length() ; j++){
            if(t.charAt(j) != '#')
                s2.push(t.charAt(j));
            else{
                 if( !s2.isEmpty())
                      s2.pop();  
            }   
        }
        String x = String.valueOf(s1);
        String y = String.valueOf(s2);
        if(x.equals(y))
            return true;
        return false;    
    }
}