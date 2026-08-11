// Last updated: 8/11/2026, 8:45:01 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < words[i].length() ; j++){
                char ch = words[i].charAt(j);
                if(ch == x){
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
}