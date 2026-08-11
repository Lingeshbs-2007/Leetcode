// Last updated: 8/11/2026, 8:51:57 PM
class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int freq[] = new int[128];
        int n = s.length();
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        while(sb.length() < n){
            int max = 0 ;
            for(int i = 1 ; i < 128 ; i++ ){
                if( freq[i] > freq[max])
                    max =  i;
            }
            for(int i = 0 ; i < freq[max] ; i++){
                   sb.append((char)max);
            }
            freq[max] = 0;
        }
        return sb.toString();
    }
}