// Last updated: 9/11/2026, 9:26:04 AM
class Solution {
    public int maxPower(String s) {
        char ch[] = s.toCharArray();
        int maxCount = 0;
        int count = 1;
        if( ch.length == 1)
             return 1;
        for( int i = 0 ; i < ch.length-1 ; i++){
             if( ch[i] == ch[i+1])
                 count++;
             else
                count = 1;     
             if( count > maxCount)
                 maxCount = count;   
        }
        return maxCount;
    }
}