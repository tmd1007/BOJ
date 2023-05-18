import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

class Main {

    static int rank;

    private static int read() throws IOException {
        boolean isMinus = false;
        int c , n = System.in.read();
        if (n == 45) {
            isMinus = true;
            n = System.in.read() & 15;
        } else {
            n = n & 15;
        }
        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return isMinus ? -n : n;
    }

    public static void main(String[] args) throws IOException {
        int N = read();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int n = read();
            arr[i] = n;
        }

        int[] arrSort = arr.clone();
        Arrays.sort(arrSort);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arrSort) {
            if (!map.containsKey(j)) {
                map.put(j, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(map.get(j)).append(' ');
        }

        System.out.println(sb);
    }
}