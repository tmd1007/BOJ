import java.io.IOException;

class Main {
    static boolean[] chk = new boolean[19999];

    public static void main(String[] args) throws IOException {


        for (int i = 1; i <= 10000; i++) {
            d(i);
            if (!chk[i])
                System.out.println(i);
        }

    }

    public static void d(int n) {
        int sum = n;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        chk[sum] = true;
    }
}