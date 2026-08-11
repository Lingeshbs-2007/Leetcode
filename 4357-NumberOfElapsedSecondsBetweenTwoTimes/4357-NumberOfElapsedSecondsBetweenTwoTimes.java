// Last updated: 8/11/2026, 8:43:40 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String st[] = startTime.split(":");
        String end[] = endTime.split(":");
        int start = Integer.parseInt(st[0])*3600 + Integer.parseInt(st[1])*60 + Integer.parseInt(st[2]);
        int e = Integer.parseInt(end[0])*3600 + Integer.parseInt(end[1])*60 + Integer.parseInt(end[2]);
        return e - start;
    }
}