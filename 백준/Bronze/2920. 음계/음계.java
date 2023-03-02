
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] input = new int[8];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        if(Arrays.equals(input, a))
            System.out.println("descending");
        else if (Arrays.equals(input, b)) {
            System.out.println("ascending");
        } else System.out.println("mixed");
    }
}