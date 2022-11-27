class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        HashMap<String,Integer> symbol = new HashMap<>();
        symbol.put("I",1);
        symbol.put("V",5);
        symbol.put("X",10);
        symbol.put("L",50);
        symbol.put("C",100);
        symbol.put("D",500);
        symbol.put("M",1000);

        for (int i = 0; i < s.length(); i++) {
            if ((i <= s.length() - 2) && symbol.get(returnStr(s.charAt(i))) < symbol.get(returnStr(s.charAt(i + 1)))) {
                answer += symbol.get(returnStr(s.charAt(i + 1))) - symbol.get(returnStr(s.charAt(i)));
                i++;
            } else answer += symbol.get(returnStr(s.charAt(i)));
        }
        return answer;
    }

    static String returnStr(char c) {
        return String.valueOf(c);
    }
}