// Last updated: 8/11/2026, 8:47:52 PM
class Solution {
    public int countOdds(int low, int high) {
          int total = high - low + 1;
          if( low % 2 == 0)
               return total / 2;
          else
               return (total+1) / 2;     
    }
}