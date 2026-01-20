class Solution {
    public int maxDistinct(String s) {
        int a[] = new int[26];
        char[] ch = s.toCharArray();
        int c = 0;
        for(int i = 0 ; i < ch.length ; i++){
            char x = ch[i];
           if (a[x - 'a'] > 0) {
            continue;
           }
            else{
                a[x-'a']++;
                c++;
            }
        }
        return c;
    }
}