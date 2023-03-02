import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        int[] repeat = new int[n];

        for (int i = 0; i < n; i++) {
            repeat[i] = sc.nextInt();
            strArr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                for (int k = 0; k < repeat[i]; k++) {
                    System.out.print(strArr[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}