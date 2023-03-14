import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();
        String[] strArr = str.split("");

        int total = 0;

        for (int i = 0; i < strArr.length; i++) {
            total += Integer.parseInt(strArr[i]);
        }

        System.out.println(total);

    }
}