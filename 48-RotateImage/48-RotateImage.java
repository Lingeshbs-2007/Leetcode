// Last updated: 8/11/2026, 8:58:09 PM
class Solution {
    public void rotate(int[][] matrix) {
         int i , j;
         int n = matrix.length;
         for( i = 0; i < n ; i++){
            for(j = i ; j < n ; j++){
                  int temp = matrix[i][j];
                  matrix[i][j] = matrix[j][i];
                  matrix[j][i] = temp;
            }
         }
         for( i = 0 ; i < n ; i++){
              int st = 0 , end = n -1;
              while( st < end ){
                 int temp = matrix[i][st];
                 matrix[i][st] = matrix[i][end];
                 matrix[i][end] = temp;

                st++;
                end--; 
              }
         }
    }
}