import java.util.*;

public class  Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int answer = 0;
        int[] coin = new int[N];

        for (int i = 0; i < coin.length; i++) {
            coin[i] = sc.nextInt();
        }

        for (int i = 0; i < coin.length; i++) {
            answer += K / coin[coin.length -1 - i];
            K %= coin[coin.length -1 - i];
        }

        System.out.println(answer);
    }
}
