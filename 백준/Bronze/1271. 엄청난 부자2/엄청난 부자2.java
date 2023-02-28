import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1, num2;

        num1 = sc.next();
        num2 = sc.next();

        System.out.println(Solution1.solution1(num1, num2));
        System.out.println(Solution2.solution2(num1, num2));

    }
}

class Solution1 {
    public static BigInteger solution1(String n, String m) {
        BigInteger big1 = new BigInteger(n);
        BigInteger big2 = new BigInteger(m);

        BigInteger answer = big1.divide(big2);

        return answer;
    }
}

class Solution2 {
    public static BigInteger solution2(String n, String m) {
        BigInteger big1 = new BigInteger(n);
        BigInteger big2 = new BigInteger(m);

        BigInteger answer = big1.remainder(big2);

        return answer;
    }
}