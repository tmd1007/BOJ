import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(chk(str));
    }

    public static String chk(String str) {
        if (str.length() == 1)
            return "NO";

        int idx = 1;
        while(idx != str.length()) {
            String left = str.substring(0,idx);
            String right = str.substring(idx);
            if (mul(left) == mul(right))
                return "YES";
            idx++;
        }
        return "NO";
    }

    public static int mul(String s) {
        int result = 1;
        for (int i = 0; i < s.length(); i++) {
            result *= s.charAt(i) - '0';
        }
        return result;
    }
}