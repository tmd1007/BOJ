import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisor = new int[number];
        int result = 0;
        for (int i = 0; i < number; i++) {
            divisor[i] = divisorNum(i+1);
            if (divisor[i] > limit)
                divisor[i] = power;
            result += divisor[i];
        }

        return result;
    }

    public static int divisorNum(int n) {
        int cnt = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0){
                cnt++;
                if (i * i < n)
                    cnt++;
            }
        }

        return cnt;
    }
}