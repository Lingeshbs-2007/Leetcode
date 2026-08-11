// Last updated: 8/11/2026, 8:44:01 PM
class Solution {
    public int maxDistance(String moves) {
        int sum = 0;
        int count = 0 ;
        int arr[] = new int[2];
        for(int i = 0 ; i < moves.length() ; i++){
            if(moves.charAt(i) == 'R')
                  arr[0] += 1 ;
            else if(moves.charAt(i) == 'L') 
                  arr[0] -= 1;
            else if(moves.charAt(i) == 'U')
                  arr[1] += 1;
            else if(moves.charAt(i) == 'D')
                  arr[1] -= 1;
            else if(moves.charAt(i) == '_')
                  count++;
        }
        for(int i = 0 ; i < 2 ; i++){
            sum += Math.abs(arr[i]);
        }
        return sum + count;
    }
}