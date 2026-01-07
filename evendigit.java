class Solution {
    public int findNumbers(int[] nums) {
        int o = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int c = 0;
            while (a != 0) {
                a = a / 10;
                c++;
            }
            if (c % 2 == 0) {
                o++;
            }
        }
        return o;
    }
}