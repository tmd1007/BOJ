class Solution {
    public String solution(String[] survey, int[] choices) {
        int[][] score = new int[4][2];
        char[][] cacao = new char[4][2];
        cacao[0][0] = 'R';
        cacao[0][1] = 'T';
        cacao[1][0] = 'C';
        cacao[1][1] = 'F';
        cacao[2][0] = 'J';
        cacao[2][1] = 'M';
        cacao[3][0] = 'A';
        cacao[3][1] = 'N';


        for (int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);

            int n = Math.abs(choices[i] - 4);

            char c;

            if (choices[i] < 4) {
                c = left;
            } else if (choices[i] > 4) {
                c = right;
            } else {
                continue;
            }

            switch (c) {
                case 'R':
                    score[0][0] += n; break;
                case 'T':
                    score[0][1] += n; break;
                case 'C':
                    score[1][0] += n; break;
                case 'F':
                    score[1][1] += n; break;
                case 'J':
                    score[2][0] += n; break;
                case 'M':
                    score[2][1] += n; break;
                case 'A':
                    score[3][0] += n; break;
                default :
                    score[3][1] += n;
            }
        }

        char[] ans = new char[4];
        for (int i = 0; i < ans.length; i++) {
            if (score[i][0] > score[i][1]) {
                ans[i] = cacao[i][0];
            } else if (score[i][0] < score[i][1]) {
                ans[i] = cacao[i][1];
            } else {
                ans[i] = cacao[i][0];
            }
        }


        return String.valueOf(ans);
    }
}