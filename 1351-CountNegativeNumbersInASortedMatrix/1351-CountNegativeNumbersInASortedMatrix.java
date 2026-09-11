// Last updated: 9/11/2026, 9:26:09 AM
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