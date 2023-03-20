import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        char[] charArr = String.valueOf(n).toCharArray();
        
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length; i++) {
            answer += (charArr[i] - 48) * Math.pow(10,i);
        }
        
        return answer;
        
    }
}