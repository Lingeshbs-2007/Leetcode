// Last updated: 8/11/2026, 8:50:48 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int arr[] = new int[2];
        for(int i = 0 ; i < moves.length() ; i++){
            char ch = moves.charAt(i);
            if( ch == 'L')
                arr[0] -= 1;
            else if( ch == 'R')
                arr[0] += 1;
            else if( ch == 'U')
                arr[1] += 1;
            else if( ch == 'D')
                arr[1] -= 1;            
        }
        if( arr[0] == 0 && arr[1] == 0)
            return true;
        return false;    
    }
}