import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            switch (c) {
                case 'A', 'B', 'C' : sum += 3; break;
                case 'D', 'E', 'F' : sum += 4; break;
                case 'G', 'H', 'I' : sum += 5; break;
                case 'J', 'K', 'L' : sum += 6; break;
                case 'M', 'N', 'O' : sum += 7; break;
                case 'P', 'Q', 'R', 'S' : sum += 8; break;
                case 'T', 'U', 'V' : sum += 9; break;
                case 'W', 'X', 'Y', 'Z' : sum += 10; break;
                default: sum += 11;
            }
        }

        System.out.println(sum);
    }
}