// Last updated: 9/11/2026, 9:24:36 AM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
         int n =  grid.length;
         for( int i = 0 ; i < n ; i++){
            for( int j = 0 ; j < n ; j++){
                 if((i == j) || (i + j == n - 1)){
                     if ( grid[i][j] == 0)
                            return false;
                 }
                 else{
                      if( grid[i][j] != 0)
                          return false;
                 }
            }
         } 
         return true;
    }
}