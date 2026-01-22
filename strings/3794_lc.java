class Solution {
    public String reversePrefix(String s, int k) {
        StringBuffer str = new StringBuffer();
        str.append(s.substring(0,k));
        str.reverse();
        str.append(s.substring(k,s.length()));
        return str.toString();
    }
}