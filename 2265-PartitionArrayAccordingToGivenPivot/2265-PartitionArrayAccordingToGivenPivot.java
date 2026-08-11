// Last updated: 8/11/2026, 8:46:48 PM
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