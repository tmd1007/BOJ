import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt, total;
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            cnt = 0;
            total = 0;
            strArr[i] = sc.next();
            for (int j = 0; j < strArr[i].length(); j++) {
                if(String.valueOf(strArr[i].charAt(j)).equals("O")){
                    cnt++;
                    total += cnt;
                } else cnt = 0;
            }
            System.out.println(total);
        }
    }
}