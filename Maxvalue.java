class Solution {
    public int maximumWealth(int[][] accounts) {
        int a, b = 0;
        for (int i = 0; i < accounts.length; i++) {
            a = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                a = a + accounts[i][j];
            }
            if (b < a) {
                b = a;
            }
        }
        return b;
    }
}