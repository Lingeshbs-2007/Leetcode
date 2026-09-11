// Last updated: 9/11/2026, 9:29:39 AM
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