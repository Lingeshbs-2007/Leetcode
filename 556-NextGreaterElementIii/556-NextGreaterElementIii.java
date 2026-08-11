// Last updated: 8/11/2026, 8:51:18 PM
class Solution {
    public int nextGreaterElement(int n) {
         String s = Integer.toString(n);
         int x = s.length();
         int nums[] = new int[x];
         int a;
         for(  a = 0 ; a < x ; a++){
               nums[a] =  s.charAt(a) - '0';
         }
         int i = x-2;
         while( i >= 0 && nums[i] >= nums[i+1]){
             i--;
         }
         if(i == -1)
            return -1;
            
         else{
             int j = x-1;
             while( nums[j] <= nums[i]){
                 j--;
             }
             int temp1 = nums[i];
             nums[i] = nums[j];
             nums[j] = temp1;
             int left = i+1 , right = x-1;
             while( left < right){
                 int temp2 = nums[left];
                 nums[left] = nums[right];
                 nums[right] = temp2;
               left++;
               right--;  
             }
         }
         long value = 0;
         for( a = 0 ; a < x ; a++){
             value = value * 10 + nums[a];
         }
         if( value > Integer.MAX_VALUE)
              return -1;
         return (int)value;     
    }
}