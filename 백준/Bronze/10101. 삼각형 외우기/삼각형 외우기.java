import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        HashSet set = new HashSet();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            sum += n;
            set.add(n);
        }

        while(true) {
            if (sum != 180) {
                System.out.println("Error");
                return;
            } else {
                if (set.size() == 2) {
                    System.out.println("Isosceles");
                    return;
                } else if (set.size() == 3) {
                    System.out.println("Scalene");
                    return;
                } else {
                    System.out.println("Equilateral");
                    return;
                }
            }
        }

    }
}