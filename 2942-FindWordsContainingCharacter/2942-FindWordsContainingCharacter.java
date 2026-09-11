// Last updated: 9/11/2026, 9:23:20 AM
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