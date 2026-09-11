// Last updated: 9/11/2026, 9:23:56 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {  
        if( k <= numOnes)
           return k;
        if( k <= numOnes + numZeros )
           return numOnes;  
        return numOnes -( k - numOnes - numZeros); // ( k - ( numOnes + numZeros)) for seeing how many -1s we want after adding 1s and 0s if k > 1s + 0s
    }
}