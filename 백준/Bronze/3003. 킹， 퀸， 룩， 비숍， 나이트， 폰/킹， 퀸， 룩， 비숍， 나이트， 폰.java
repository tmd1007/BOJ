import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        int[] numArr = new int[strArr.length];
        int[] temp = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = temp[i] - Integer.parseInt(strArr[i]);
            System.out.print(numArr[i] + " ");
        }


    }
}