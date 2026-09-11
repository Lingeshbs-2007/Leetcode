// Last updated: 9/11/2026, 9:23:55 AM
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