// Last updated: 9/11/2026, 9:25:53 AM
class Solution {
    public int countOdds(int low, int high) {
          int total = high - low + 1;
          if( low % 2 == 0)
               return total / 2;
          else
               return (total+1) / 2;     
    }
}