import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int[][] map;
    static int[][][] block = new int[19][][];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        block[0] = new int[][]{{0,1}, {0,2}, {0,3}};
        block[1] = new int[][]{{1,0}, {2,0}, {3,0}};
        block[2] = new int[][]{{0,1}, {1,1}, {1,0}};
        block[3] = new int[][]{{1,0}, {2,0}, {2,1}};
        block[4] = new int[][]{{0,1}, {0,2}, {-1,2}};
        block[5] = new int[][]{{0,1}, {1,1}, {2,1}};
        block[6] = new int[][]{{-1,0}, {-1,1}, {-1,2}};
        block[7] = new int[][]{{0,1}, {-1,1}, {-2,1}};
        block[8] = new int[][]{{0,1}, {0,2}, {1,2}};
        block[9] = new int[][]{{-1,0}, {-2,0}, {-2,1}};
        block[10] = new int[][]{{1,0}, {1,1}, {1,2}};
        block[11] = new int[][]{{1,0}, {1,1}, {2,1}};
        block[12] = new int[][]{{1,0}, {1,-1}, {2,-1}};
        block[13] = new int[][]{{0,1}, {-1,1}, {-1,2}};
        block[14] = new int[][]{{0,1}, {1,1}, {1,2}};
        block[15] = new int[][]{{0,1}, {0,2}, {1,1}};
        block[16] = new int[][]{{0,1}, {0,2}, {-1,1}};
        block[17] = new int[][]{{0,1}, {1,1}, {-1,1}};
        block[18] = new int[][]{{0,-1}, {1,-1}, {-1,-1}};

        int answer = 0;
        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    boolean chk = true;
                    int sum = map[j][k];
                    for (int l = 0; l < 3; l++) {
                        int x = j + block[i][l][0];
                        int y = k + block[i][l][1];
                        if (x >= 0 && x < N && y >= 0 && y < M) {
                            sum += map[x][y];
                        } else {
                            chk = false;
                            break;
                        }
                    }
                    if (chk) {
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}