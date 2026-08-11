// Last updated: 8/11/2026, 8:58:40 PM
class Solution {
    boolean matching(char ch , char top){
        if( (ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{') )
              return true;
        return false;      
    }
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        char arr[] = s.toCharArray();
        for(char ch : arr){
            if( ch == '(' || ch == '[' || ch == '{')
                  s1.push(ch);
            else{ 
                if(s1.isEmpty())
                    return false;
                 char top = s1.pop();
                 if(matching(ch,top)){
                    continue;
                 }else
                     return false;   
            }      
        }
        if(s1.isEmpty())
            return true;
        else
            return false;    
    }
}