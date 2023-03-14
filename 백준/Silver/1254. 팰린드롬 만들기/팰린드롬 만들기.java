import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int cnt = 0;

        while(true){
            if(palindrome(input.substring(cnt)))
                break;
            else cnt++;
        }

        System.out.println(input.length() + cnt);
    }

    public static boolean palindrome(String s){
        boolean result = true;

        for (int i = 0; i < (s.length()+1) / 2; i++) {
            char first = s.charAt(i);
            char end = s.charAt(s.length()-1 -i);
            if(first != end)
                return false;
        }

        return result;
    }
}