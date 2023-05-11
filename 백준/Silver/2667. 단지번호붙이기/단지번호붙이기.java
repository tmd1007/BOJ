import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {

    static boolean[][] graph;
    static int[] movX = {-1, 1, 0, 0};
    static int[] movY = {0, 0, 1, -1};
    static int cnt;
    static List<Integer> list = new ArrayList<>();

    public static void dfs(int x, int y) {
        graph[x][y] = false;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int newX = x + movX[i];
            int newY = y + movY[i];
            if (graph[newX][newY]) {
                dfs(newX, newY);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int range = N + 2;
        graph = new boolean[range][range];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    graph[i+1][j+1] = true;
                }
            }
        }

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                if (graph[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');
        for (int n : list) {
            sb.append(n).append('\n');
        }

        System.out.println(sb);
    }
}