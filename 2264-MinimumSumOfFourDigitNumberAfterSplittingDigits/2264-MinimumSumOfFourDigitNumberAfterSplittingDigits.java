// Last updated: 8/11/2026, 8:46:51 PM
class Solution {
    public int minimumSum(int num) {
        int i , d , j , sum = 0;
        int arr[] = new int[4];
        for(i = 0 ; i < 4 ; i++){
                d = num % 10;
                arr[i] = d;
                num = num / 10;
        }
        for( i = 0 ; i < 4 ; i++){
            for( j = i + 1 ; j < 4; j++){
                if( arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] =  arr[j];
                    arr[j] = temp;
                }
                     
            }
        }
        int num1 = (arr[0] * 10) + arr[2];
        int num2 = (arr[1] * 10) + arr[3];
        
        return num1 + num2;
    }
}