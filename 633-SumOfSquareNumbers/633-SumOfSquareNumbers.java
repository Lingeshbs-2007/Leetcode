// Last updated: 8/11/2026, 8:51:06 PM
class Solution {
    public boolean judgeSquareSum(int c) {
         int st = 0  ,  end = (int)Math.sqrt(c);
         while( st <= end){
            long n = (long)(st*st) + (long)(end*end);
             if(n == c)
                return true;
             else if(n > c )
                 end--; 
             else
                 st++;
         }
         return false;
    }
}