// Last updated: 8/11/2026, 8:48:38 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length <= 2)
            return false;
        for( int i = 0 ; i < arr.length-2 ; i++){
              if( arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0)
                  return true;
         }
         return false;
    }
}