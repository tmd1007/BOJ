import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][][] num = new int[2][N][M];


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    num[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d", num[0][i][j] + num[1][i][j]);
                if (j == M-1)
                    break;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}