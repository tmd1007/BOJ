import java.math.BigInteger;

class Solution {
    public BigInteger[] solution(int x, int n) {
        BigInteger[] answer = new BigInteger[n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = BigInteger.valueOf((long)x*(i+1));
        }

        return answer;
    }
}