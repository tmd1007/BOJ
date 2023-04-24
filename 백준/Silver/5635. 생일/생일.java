import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Mans[] mans = new Mans[N];


        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            Mans m = new Mans(name, day, month, year);
            mans[i] = m;
        }

        Arrays.sort(mans);

        System.out.println(mans[0].name);
        System.out.println(mans[mans.length-1].name);
    }
}

class Mans implements Comparable<Mans> {
    String name;
    int day;
    int month;
    int year;

    Mans(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Mans o) {
        if (this.year == o.year) {
            if (this.month == o.month) {
                return o.day - this.day;
            } else {
                return o.month - this.month;
            }
        } else
            return o.year - this.year;
    }
}