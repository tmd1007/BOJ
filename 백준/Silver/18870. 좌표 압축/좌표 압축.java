import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arrSort = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
            arrSort[i] = n;
        }

        Arrays.sort(arrSort);
        HashMap<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for (int j : arrSort) {
            if (!map.containsKey(j)) {
                map.put(j, idx);
                idx++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }

        System.out.println(sb);
    }
}