// Last updated: 8/11/2026, 8:53:18 PM
class Solution {
    public String reverseVowels(String s) {
        int st = 0 ;
        int end = s.length()-1;
        char ch[] = s.toCharArray();
        while(st < end){
            while( st < end && !(ch[st] == 'A' || ch[st] == 'E' || ch[st] == 'I' || ch[st] == 'I' || ch[st] == 'O' || ch[st] == 'U' || ch[st] == 'a' || ch[st] == 'e' || ch[st] == 'i' || ch[st] == 'o' || ch[st] == 'u'))
                  st++;
            while( st < end && !(ch[end] == 'A' || ch[end] == 'E' || ch[end] == 'I' || ch[end] == 'I' || ch[end] == 'O' || ch[end] == 'U' || ch[end] == 'a' || ch[end] == 'e' || ch[end] == 'i' || ch[end] == 'o' || ch[end] == 'u'))
                  end--;
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;            
            end--;
        }
        return new String(ch);   
    }
}