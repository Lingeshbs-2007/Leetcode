// Last updated: 8/11/2026, 8:52:15 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
        int count = 0;
        int end = Integer.MIN_VALUE;
        for(int[] ele: intervals){
            if( ele[0] >= end)
                 end = ele[1];
            else
                 count++;     
        }
        return count;
    }
}