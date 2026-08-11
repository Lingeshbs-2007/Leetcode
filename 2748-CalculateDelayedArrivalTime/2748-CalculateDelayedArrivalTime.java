// Last updated: 8/11/2026, 8:45:49 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time = arrivalTime + delayedTime;
        if( time == 24)
             return 0;
        else if( time > 24)
             return time % 24;
        else
            return time;          
    }
}