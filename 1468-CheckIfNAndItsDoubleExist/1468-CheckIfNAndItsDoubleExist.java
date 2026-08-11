// Last updated: 8/11/2026, 8:48:15 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for(int i : arr){
            if(s.contains(i*2) || ( i % 2 == 0 && s.contains(i/2)))
                return true;
            else
                s.add(i);    
        }
        return false;
    }
}