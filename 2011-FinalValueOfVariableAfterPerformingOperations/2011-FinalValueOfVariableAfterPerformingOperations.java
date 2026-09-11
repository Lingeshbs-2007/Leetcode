// Last updated: 9/11/2026, 9:25:04 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
      int X = 0;
      
      for ( int i =0; i < operations.length ; i++){
        if ( operations[i].equals("--X") )
              X --;
        else if ( operations[i].equals("X--"))
              X --;
        else if ( operations[i].equals( "X++"))
              X ++;
        else 
              X ++;
      }
       return  X;
    }
}