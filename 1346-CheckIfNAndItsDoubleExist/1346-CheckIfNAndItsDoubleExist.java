// Last updated: 9/11/2026, 9:26:12 AM
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