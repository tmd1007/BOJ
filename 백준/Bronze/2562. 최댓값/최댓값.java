
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[9];
        int max = 0;
        int idx = 0;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            if(max < numArr[i]) {
                max = numArr[i];
                idx = i+1;
            }
        }
        System.out.printf("%d\n%d", max, idx);
    }
}