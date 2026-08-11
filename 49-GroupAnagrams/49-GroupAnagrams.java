// Last updated: 8/11/2026, 8:58:05 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String s1 : strs){
            char arr[] = s1.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if(!m.containsKey(sortedString)){
                m.put(sortedString,new ArrayList<>());
            }
            m.get(sortedString).add(s1);
        }
        return new ArrayList<>(m.values());
    }
}