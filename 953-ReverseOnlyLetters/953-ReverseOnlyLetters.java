// Last updated: 8/11/2026, 8:49:34 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int st = 0;
        int end = arr.length-1;
        while(st < end){
            if(!Character.isLetter(arr[st]))
               st++;
            else if(!Character.isLetter(arr[end]))
               end--;
            else{
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }      
        }
        return new String(arr);
    }
}