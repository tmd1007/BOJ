import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[9];

        for (int i = 0; i < 9; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        int sum = Arrays.stream(numArr).sum();
        int one = 0;
        int two = 0;
        for (int i = 0; i < numArr.length-1; i++) {
            for (int j = i+1; j < numArr.length; j++) {
                if (sum - numArr[i] - numArr[j] == 100){
                    one = i;
                    two = j;
                    break;
                }
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            if (i != one && i != two)
                System.out.println(numArr[i]);
        }
    }
}