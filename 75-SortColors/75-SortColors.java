// Last updated: 8/11/2026, 8:57:07 PM
import java.util.*;
class Solution {
    public static void sortColors(int[] nums) {
      
        int i,c0 =0,c1 =0,c2 =0;
        
        for( i =0; i < nums.length; i++){
            
            if( nums[i] == 0)
                 c0 += 1;
            else if( nums[i] == 1)
                 c1 += 1;
            else
                 c2 += 1;          
        }
        for( i = 0; i < c0; i++)
               nums[i] = 0;
        for( i = c0; i < (c0+c1); i++)
               nums[i] = 1;
        for( i = (c0 +c1); i < nums.length ; i++) 
               nums[i] = 2;
        for( i = 0; i < nums.length; i++)
              System.out.print(nums[i] + " ");                 
            

    }
}