// Last updated: 9/11/2026, 9:23:30 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
          int sum = 0;
          if( mainTank < 5){
              return mainTank*10;
          }
          while( mainTank >= 5 && additionalTank >= 1){
                 sum += 50 ;
                 mainTank = mainTank - 5;
                 additionalTank -= 1;
                 mainTank += 1;

          }
          sum += mainTank * 10;
          return sum;
    }
}