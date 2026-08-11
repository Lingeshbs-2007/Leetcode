// Last updated: 8/11/2026, 8:48:11 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int i , j,n,m,count = 0;
        for( i = 0 ; i < grid.length ; i++){
            for( j = 0 ;  j < grid[i].length; j++){
                if( grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}