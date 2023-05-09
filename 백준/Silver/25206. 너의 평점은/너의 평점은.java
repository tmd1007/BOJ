import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = 20;

        double all = 0;
        double sum = 0;
        while (T-- > 0) {
            String[] arr = br.readLine().split(" ");
            double score = Double.parseDouble(arr[1]);
            double grade;
            if (arr[2].equals("P")) {
                continue;
            } else {
                grade = grade(arr[2]);
            }
            all += score * grade;
            sum += score;
        }

        System.out.printf("%.6f", all / sum);
    }

    public static double grade(String str) {
        double num;
        switch (str) {
            case "A+" : return 4.5;
            case "A0" : return 4.0;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            default: num = 0.0;
        }

        return num;
    }
}