// Last updated: 8/16/2026, 8:53:48 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int maxLight = 0;
4        for(int light : lights){
5            maxLight = Math.max(maxLight,light);
6        }
7        int answer =0;
8        for(int time : arrivalTime){
9            int r = time % period;
10            int wait ;
11            if( r < maxLight){
12                wait = 0;
13            }
14            else{
15                wait = period - r;
16            }
17            answer = Math.max(answer,wait);
18        }
19            return answer;
20    }
21}