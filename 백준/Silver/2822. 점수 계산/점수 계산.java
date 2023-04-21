import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            map.put(arr[i], i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int n : arr) {
            list.add(n);
        }

        Collections.sort(list);

        list.subList(0, 3).clear();

        int sum = 0;

        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            if (list.contains(n)) {
                sum += n;
                sb.append(map.get(n) + 1).append(" ");
            }
        }

        sb.insert(0, sum + "\n");
        System.out.println(sb);
    }
}