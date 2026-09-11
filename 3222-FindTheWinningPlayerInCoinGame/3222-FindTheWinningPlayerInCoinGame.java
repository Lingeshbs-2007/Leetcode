// Last updated: 9/11/2026, 9:22:51 AM
class Solution {
    public String winningPlayer(int x, int y) {
         int count = 0;
         while( x >= 1 && y >= 4){
               x -= 1;
               y -= 4;
               count++;
         }
         if( count % 2 == 0)
             return "Bob";
         else
             return "Alice";    
    }
}