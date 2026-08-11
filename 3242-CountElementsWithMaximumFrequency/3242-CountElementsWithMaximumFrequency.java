// Last updated: 8/11/2026, 8:44:55 PM
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