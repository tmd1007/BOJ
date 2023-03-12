class Solution {
    public String solution(String X, String Y) {
        int[] chkX = new int[10];
        int[] chkY = new int[10];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {
            chkX[X.charAt(i) - 48]++;
        }

        for (int i = 0; i < Y.length(); i++) {
            chkY[Y.charAt(i) - 48]++;
        }

        for (int i = 9; i >= 0; i--) {
            sb.append(String.valueOf(i).repeat(Math.min(chkX[i], chkY[i])));
        }

        return sb.toString().length() == 0 ? "-1" : sb.toString().indexOf("0") == 0 ? "0" : sb.toString();
    }
}