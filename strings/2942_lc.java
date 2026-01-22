class Solution {
    public int[] findWordsContaining(String[] words, char x) {
        int c  = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                c++;
            }
        }

        
        int[] result = new int[c];
        int cr = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result[cr] = i;
                cr++;
            }
        }

        return result;
    }
}
