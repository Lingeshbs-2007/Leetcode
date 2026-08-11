// Last updated: 8/11/2026, 8:44:40 PM
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
         int sum = 0,count = 0;
         int i ,j, n = apple.length ,m = capacity.length;
         for( i = 0 ; i < n; i++){
            sum +=  apple[i];
         }
         for( i = 0 ; i < m ; i++){
            for( j = i+1 ; j < m ; j++){
                if( capacity[i] < capacity[j]){
                    int temp = capacity[i];
                    capacity[i] = capacity[j];
                    capacity[j] = temp;
                }
            }
         }
        for( j = 0 ; j < m && sum > 0 ; j++){
                sum = sum - capacity[j];
                count++;
        }
         return count;
    }
}