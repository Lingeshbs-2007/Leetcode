// Last updated: 8/11/2026, 8:56:41 PM
class Solution {
    public boolean isPalindrome(String s) {
       int i;
       s = s.toLowerCase();
       String update ="";
       for( i = 0 ; i < s.length() ; i++){
              char ch = s.charAt(i);
              if(( ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
                    update += ch;
       }
       int st = 0 , e = update.length() -1;
       char arr[] = update.toCharArray();
       char temp;
       while( st < e){
            temp = arr[st];
            arr[st] = arr[e];
            arr[e] = temp;
            st++;
            e--;
       }
       String s1 = new String(arr);
       if( update.equals(s1))
            return true;
       else
            return false;     

    }
}