// Last updated: 9/11/2026, 9:25:20 AM
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