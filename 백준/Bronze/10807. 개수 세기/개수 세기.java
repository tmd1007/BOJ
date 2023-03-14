import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numArr = new int[N];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == target)
                cnt++;
        }

        System.out.println(cnt);
    }
}