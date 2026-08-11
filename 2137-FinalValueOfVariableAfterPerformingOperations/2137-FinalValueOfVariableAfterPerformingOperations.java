// Last updated: 8/11/2026, 8:47:07 PM
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