// Last updated: 8/11/2026, 8:51:50 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < s.length ; j++){
                if(s[j] == 0)
                   continue;
                else{
                    if( s[j] >= g[i]){
                        count++;
                        s[j] = 0;
                        break;
                    }
                }   
            }
        }
        return count;
    }
}