// Last updated: 8/11/2026, 8:45:17 PM
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