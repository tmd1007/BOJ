class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = GCD(n ,m);

        answer[0] = gcd;
        answer[1] = n * m / gcd;

        return answer;
    }

    public static int GCD(int n, int m) {
        if (n % m == 0)
            return m;
        else return GCD(m, n % m);
    }
}