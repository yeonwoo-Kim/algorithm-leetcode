class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";

        if(strs.length == 0 ) return "";

        answer = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(answer) != 0) {
                answer = answer.substring(0, answer.length() - 1);
                if(answer.isEmpty()) return "";
            }
        }
        
        return answer;
    }
}