class Solution {
    public int scoreOfString(String s) {
        int a = 0;
        int b = 0;
        byte[] result = s.getBytes();
        for (int i = 0 ; i < result.length-1;i++){
           a = Math.abs(result[i] - result[i+1]);
           b = b+a;
        }
        return b;
    }
}