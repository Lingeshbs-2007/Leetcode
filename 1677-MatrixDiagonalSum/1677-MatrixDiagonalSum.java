// Last updated: 8/11/2026, 8:47:34 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for( int i = 0 ; i <= mat.length -1 ; i++){
            for( int j = 0 ; j <= mat.length-1 ; j++){
                 if( i == j)
                     sum += mat[i][j];
                 else if ( i + j == (mat.length-1))
                       sum += mat[i][j];   
            }
        }
        return sum;
    }
}