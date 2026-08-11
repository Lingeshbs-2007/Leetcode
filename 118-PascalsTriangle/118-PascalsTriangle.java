// Last updated: 8/11/2026, 8:56:59 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1 ; j < i ; j++){
                List<Integer> prevRows = new ArrayList<>(result.get(i-1));
                row.add(prevRows.get(j-1)+prevRows.get(j));
            }
            if( i > 0)
               row.add(1);
            result.add(row);   
        }
        return result;
    }
}