class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] chkPrime = new boolean[n+1];

        for (int i = 2; i < chkPrime.length; i++) {
            if (chkPrime[i])
                continue;
            answer++;
            int num = i;
            for (int j = num; j <= n; j += num) {
                chkPrime[j] = true;
            }
        }
        
        return answer;
    }
    
    public static boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}