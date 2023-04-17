import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<Members> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = i + 1;
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Members m = new Members(cnt, age, name);
            list.add(m);
        }

        list.sort(new Comparator<Members>() {
            @Override
            public int compare(Members o1, Members o2) {
                if (o1.age == o2.age) {
                    return o1.cnt - o2.cnt;
                } else
                    return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).age).append(" ").append(list.get(i).name).append('\n');
        }

        System.out.println(sb);
    }
}

class Members {
    int cnt;
    int age;
    String name;
    Members(int cnt, int age, String name) {
        this.cnt = cnt;
        this.age = age;
        this.name = name;
    }
}