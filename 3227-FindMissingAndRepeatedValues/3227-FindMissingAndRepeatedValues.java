// Last updated: 8/11/2026, 8:44:57 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int i , j;
        int ans[] = new int[2];
        int sum = 0 , n = grid.length;
        for( i = 0 ; i < n ; i++){
            for( j = 0 ; j < n ; j++){
                   sum += grid[i][j];
                   for( int x = 0 ; x < n ; x++){
                     for( int y = 0 ; y < n ; y++){
                          if( grid[i][j] == grid[x][y] && (i != x || j != y)){
                                ans[0] = grid[i][j];
                          }
                     }
                   }
            }
        }
        int a = n*n;
        int total = a*(a+1)/2;
        int value = total - sum;
        ans[1] = value + ans[0];
        return ans;
    }
}