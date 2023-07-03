import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static int seq;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<int[]> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken()) - 1;
            if (!set.contains(n)) {
                list.add(new int[]{0,0,0}); // num, cnt, idx
                set.add(n);
                list.get(seq)[0] = n;
                list.get(seq)[2] = seq;
                list.get(seq)[1]++;
                map.put(n, seq);
                seq++;
            } else {
                list.get(map.get(n))[1]++;
            }
        }

        list.sort((o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[2] - o2[2];
            }
            return o2[1] - o1[1];
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            while(list.get(i)[1] > 0) {
                sb.append(list.get(i)[0] + 1).append(' ');
                list.get(i)[1]--;
            }
        }

        System.out.println(sb);
    }
}