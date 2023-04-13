import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] s = str.split(" ");

        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "MON");
        month.put(2, "TUE");
        month.put(3, "WED");
        month.put(4, "THU");
        month.put(5, "FRI");
        month.put(6, "SAT");
        month.put(0, "SUN");

        HashMap<Integer, Integer> day = new HashMap<>();
        day.put(1, 0);
        day.put(2, 31);
        day.put(3, 28);
        day.put(4, 31);
        day.put(5, 30);
        day.put(6, 31);
        day.put(7, 30);
        day.put(8, 31);
        day.put(9, 31);
        day.put(10, 30);
        day.put(11, 31);
        day.put(12, 30);

        int cnt = 0;

        for (int i = 1; i <= Integer.parseInt(s[0]); i++) {
            cnt += day.get(i);
        }
        cnt += Integer.parseInt(s[1]);
        cnt = cnt % 7;
        System.out.println(month.get(cnt));
    }
}