// Last updated: 8/11/2026, 8:53:44 PM
class Solution {
    public int findDuplicate(int[] nums) {
         int value = 0;
         int freq[] = new int[nums.length + 1];
         for( int i : nums){
              freq[i]++;
         } 
         for( int j = 0 ; j < nums.length +1 ; j++){
            if( freq[j] > 1)
                 value = j;
         }
         return value;
    }
}