import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str = sc.next();

        double score = 0.0;

        if (str.length() == 1)
            System.out.println(score);
        else {
            score += str.charAt(0) == 'A' ? 4.0 : str.charAt(0) == 'B' ? 3.0 : str.charAt(0) == 'C' ? 2.0 : 1.0;
            score += str.charAt(1) == '+' ? 0.3 : str.charAt(1) == '-' ? -0.3 : 0.0;
            System.out.println(score);
        }
    }

}