// Last updated: 8/11/2026, 8:45:53 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {  
        if( k <= numOnes)
           return k;
        if( k <= numOnes + numZeros )
           return numOnes;  
        return numOnes -( k - numOnes - numZeros); // ( k - ( numOnes + numZeros)) for seeing how many -1s we want after adding 1s and 0s if k > 1s + 0s
    }
}