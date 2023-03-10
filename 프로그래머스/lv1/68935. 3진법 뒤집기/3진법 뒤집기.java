class Solution {
    public int solution(int n) {
        int answer = 0;

        int base = 3;
        String strNum = Integer.toString(n, base);
        StringBuilder sb = new StringBuilder(strNum);
        sb.reverse();

        strNum = sb.toString();
        answer = Integer.parseInt(strNum, base);

        return answer;
    }
}