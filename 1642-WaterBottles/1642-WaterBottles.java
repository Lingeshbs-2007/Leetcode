// Last updated: 8/11/2026, 8:47:47 PM
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