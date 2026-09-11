// Last updated: 9/11/2026, 9:25:48 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
           int  sum = numBottles;
           int empty = numBottles;
           while(empty >= numExchange ){
                  numBottles = empty / numExchange ;
                  sum += numBottles;
                  empty = (empty % numExchange) + numBottles;
           }   
           return sum;
    }
}