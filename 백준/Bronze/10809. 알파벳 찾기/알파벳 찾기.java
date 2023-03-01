import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int[] alpha = new int[26];

        Arrays.fill(alpha, -1);

        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'a'] = str.indexOf(str.charAt(i));
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i]);
            if(i != alpha.length -1)
                System.out.print(" ");
        }



    }
}