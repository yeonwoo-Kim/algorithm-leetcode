class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<String> srr = new ArrayList<>();
        List<String> trr = new ArrayList<>();

        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();

        for (String sword : s.split("")) {
            if (!srr.contains(sword)) srr.add(sword);
            sbS.append(srr.indexOf(sword)).append(",");

        }
        for (String tword : t.split("")) {
            if(!trr.contains(tword)) trr.add(tword);
            sbT.append(trr.indexOf(tword)).append(",");

        }

        if(sbS.toString().equals(sbT.toString())) return true;
        else return false;
    }
}