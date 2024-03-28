class Solution {
    public int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        int index = c.length;
        for(int i = c.length - 1; i > 0; i--){
            if(c[i] < c[i - 1]){
                c[i - 1] -- ;
                index = i;
            }
        }
        for(int i = index; i < c.length; i++){
            c[i] = '9';
        }
        return Integer.valueOf(new String(c));
    }
}
// O(logN), O(logN)
