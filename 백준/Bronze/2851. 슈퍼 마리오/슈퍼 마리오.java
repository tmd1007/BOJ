import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            if (sum == 100) {
                System.out.println(sum);
                break;
            } else if (sum > 100) {
                int min = sum - arr[i];
                if (Math.abs(100-sum) == Math.abs(100-min)) {
                    System.out.println(sum);
                } else if (Math.abs(100-sum) > Math.abs(100-min)){
                    System.out.println(min);
                } else {
                    System.out.println(sum);
                }
                break;
            }
        }

        if (sum < 100) {
            System.out.println(sum);
        }
    }
}