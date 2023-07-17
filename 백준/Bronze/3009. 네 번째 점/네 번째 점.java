import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<Integer> listX = new HashSet<>();
        HashSet<Integer> listY = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (listX.contains(x)) {
                listX.remove(x);
            } else {
                listX.add(x);
            }
            if (listY.contains(y)) {
                listY.remove(y);
            } else {
                listY.add(y);
            }
        }

        Object[] x = listX.toArray();
        Object[] y = listY.toArray();

        System.out.printf("%s %s", x[0], y[0]);

    }
}