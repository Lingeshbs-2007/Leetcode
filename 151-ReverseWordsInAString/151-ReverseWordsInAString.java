// Last updated: 8/11/2026, 8:56:10 PM
class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        String arr[] = s.split("\\s+");
        int st= 0 , end = arr.length-1;
        while( st < end ){
            String temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
           st++;
           end--; 
        }
        String result = String.join(" ",arr);
        // String ans=" ";
        // for(int i=end;i>=0;i--){
        //     String temp=arr[i];
        //     ans=ans+temp+" ";
        // }
        // ans=ans.trim();
       return result;
    }
}