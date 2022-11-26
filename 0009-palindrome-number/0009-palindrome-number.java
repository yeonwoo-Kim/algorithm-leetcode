class Solution {
    public boolean isPalindrome(int x) {
        boolean chk = false;
        StringBuffer sb = new StringBuffer(String.valueOf(x));

        if (sb.toString().equals(sb.reverse().toString())) {
            chk = true;
        }
        
        return chk;
    }
}