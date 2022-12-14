class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        if(s == null || t == null) return false;

        int prevIdx = -1;

        for (int i = 0; i < s.length(); i++) {
            int curIdx = 0;
            if (prevIdx == -1) {
                curIdx = t.indexOf(s.charAt(i), 0);
            } else {
                curIdx = t.indexOf(s.charAt(i), prevIdx + 1);
            }

            if(curIdx <= prevIdx) return false;
            prevIdx = curIdx;
        }
        return true;
    }
}