class Solution {
    public int largestAltitude(int[] gain) {
        int[] a = new int[gain.length + 1];
        a[0] = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {

            a[i + 1] = a[i] + gain[i];
            max = Math.max(max, a[i + 1]);

        }
        return max;
    }
}