class Solution {
    public int solution(int a, int b) {
        int gcd = GCD(a, b);

        b /= gcd;

        while(b % 2 == 0){
            b /= 2;
        }

        while(b % 5 == 0){
            b /= 5;
        }

        return b == 1 ? 1 : 2;
    }

    public static int GCD(int a, int b){
        int GCD = 1;

        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                GCD = i;

        }

        return GCD;
    }
}