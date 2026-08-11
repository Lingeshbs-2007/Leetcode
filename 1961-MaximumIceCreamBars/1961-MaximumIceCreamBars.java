// Last updated: 8/11/2026, 8:47:23 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int sum = 0;
        for(int num : costs){
            if( sum + num <= coins ){
               count++;
               sum += num;
            }  
           
        }
        return count;
    }
}