
class Solution {
    public int maxFreqSum(String s) {
        int [] fre = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            fre[s.charAt(i) - 'a']++;
        }
        int maxv = 0 ; 
        int maxc = 0;

        for(int i = 0 ;i < 26 ; i++){
            char ch = (char)(i+'a');
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxv = Math.max(maxv , fre[i]);
            }else{
                maxc = Math.max(maxc , fre[i]);
            }
        }
        return maxv + maxc;
    }
}