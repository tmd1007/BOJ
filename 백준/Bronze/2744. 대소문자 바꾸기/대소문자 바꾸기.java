import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 'Z')
                sb.append(Character.toString(str.charAt(i) - 32));
            else sb.append(Character.toString(str.charAt(i) + 32));
        }

        System.out.println(sb);
    }

}