import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        int len = B.length - A.length;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= len; i++) {
            int cnt = 0;
            char[] C = new char[B.length];
            for (int j = 0; j < A.length; j++) {
                C[j + i] = A[j];
            }
            for (int j = 0; j < B.length; j++) {
                if (C[j] != B[j]) {
                    cnt++;
                }
            }
            answer = Math.min(answer, cnt);
        }

        System.out.println(answer - len);
    }
}