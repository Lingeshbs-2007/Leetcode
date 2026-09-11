// Last updated: 9/11/2026, 9:26:55 AM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if( n == 1)
           return 1;
        int current = 1;
        int max = 1;
        char prev = ' ';   
        for(int i = 1 ; i < n ; i++){
            char curr;
            if( arr[i-1] < arr[i])
               curr = '<';
            else if( arr[i-1] > arr[i])
               curr = '>';
            else
              curr = '=';

            if( curr == '=')
               current = 1;
            else if(prev == ' ' || curr != prev)
               current++;
            else
               current = 2;
            max = Math.max(max,current);
            prev = curr;                 
        }
        return max;
    }
}