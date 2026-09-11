// Last updated: 9/11/2026, 9:24:46 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[] = new int[nums.length];
        int k = 0;
        for(int num : nums){
            if( num < pivot)
               res[k++] = num;
        }
        for(int num : nums){
            if( num == pivot)
               res[k++] = num;
        }
        for(int num : nums){
            if( num > pivot)
               res[k++] = num;
        }
        return res;
    }
}