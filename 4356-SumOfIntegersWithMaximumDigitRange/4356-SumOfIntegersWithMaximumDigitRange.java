// Last updated: 8/11/2026, 8:43:38 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int sum = 0;
        int arr[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int max = 0;
            int min = Integer.MAX_VALUE;
            int num = nums[i];
            while(num != 0){
                int d = num % 10;
                if( d > max)
                   max = d;
                if( d < min)
                    min = d;
                num = num / 10;
            }
            arr[i] = max - min;
        }
        int maxRange = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > maxRange)
                maxRange = arr[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            if( arr[i] == maxRange)
                sum += nums[i];
        }
        return sum;
    }
}