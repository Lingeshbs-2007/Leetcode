// Last updated: 9/11/2026, 9:29:33 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char ch[] = jewels.toCharArray();
        char c[] = stones.toCharArray(); 
         for( int i = 0 ; i < jewels.length() ; i++){
            for( int j = 0 ; j < stones.length() ; j++){
                if( ch[i] == c[j])
                       count++;
            }
         }
         return count;
    }
}