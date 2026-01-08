class Solution {
    public int[] decompressRLElist(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i += 2) {
            s = s + nums[i];
        }
        int[] a = new int[s];
        int in = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int f = nums[i];
            int v = nums[i + 1];

            for (int j = 0; j < f; j++) {
                a[in++] = v;
            }

        }
        return a;
    }
}