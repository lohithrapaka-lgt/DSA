class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[2 * n];
        int b = 0;
        for (int i = 0; i < n; i++) {
            a[b++] = nums[i];
            a[b++] = nums[n + i];
        }
        return a;
    }
}