// Last updated: 9/11/2026, 9:25:43 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        char res[] = new char[indices.length];
        for(int i = 0 ; i < indices.length ; i++){
              res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}