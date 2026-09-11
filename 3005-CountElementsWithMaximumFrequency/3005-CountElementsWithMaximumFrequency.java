// Last updated: 9/11/2026, 9:23:10 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        int max = 0 ;
        for(int i = 0 ; i < 101 ; i++){
            if(freq[i] > max)
                max = freq[i];
        }
        int sum = 0 ;
        for(int i = 0 ; i < 101 ; i++){
            if( freq[i] == max)
                sum +=freq[i];
        }
        return sum;
    }
}