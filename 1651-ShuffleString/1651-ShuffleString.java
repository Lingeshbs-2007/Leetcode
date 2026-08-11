// Last updated: 8/11/2026, 8:47:42 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char res[] = new char[indices.length];
        for(int i = 0 ; i < indices.length ; i++){
              res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}