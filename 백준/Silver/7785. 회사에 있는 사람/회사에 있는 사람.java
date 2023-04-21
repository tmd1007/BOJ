import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("enter"))
                list.add(entry.getKey());
        }

        list.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}