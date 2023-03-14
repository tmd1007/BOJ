import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            total += (int) Math.pow(N,2);
        }

        System.out.println(total % 10);
    }

}