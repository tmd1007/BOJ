class Solution {
    public int solution(int i, int j, int k) {
        String str = "";

        for (int l = i; l <= j; l++) {
            str = str.concat(String.valueOf(l));
        }

        return str.length() - str.replace(String.valueOf(k), "").length();
    }
}