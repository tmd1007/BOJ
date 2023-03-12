class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] chkX = new int[10];
        int[] chkY = new int[10];

        StringBuilder sb = new StringBuilder(answer);

        for (int i = 0; i < X.length(); i++) {
            chkX[Integer.parseInt(String.valueOf(X.charAt(i)))]++;
        }

        for (int i = 0; i < Y.length(); i++) {
            chkY[Integer.parseInt(String.valueOf(Y.charAt(i)))]++;
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(chkX[i], chkY[i]); j++) {
                sb.append(i);
            }
        }

        return sb.toString().length() == 0 ? "-1" : sb.toString().indexOf("0") == 0 ? "0" : sb.toString();
    }
}