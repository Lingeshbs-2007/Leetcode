// Last updated: 8/11/2026, 8:50:05 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = 0 , b = 0;
        for(int i = 0 ; i < cost.length ; i++){
              int c = Math.min(a,b) + cost[i];
              a = b;
              b = c;
        }
        return Math.min(a,b);
    }
}