import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[31];

        for (int i = 1; i <= 28; i++) {
            int N = sc.nextInt();
            num[N]++;
        }

        for (int i = 1; i < num.length; i++) {
            if (num[i] == 0)
                System.out.println(i);
        }
    }
}