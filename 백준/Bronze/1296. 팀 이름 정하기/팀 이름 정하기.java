import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] cnt = new int[4];
    int[][] LOVE;
    int N;
    String[] teams;
    String name;

    public Main() throws IOException {
        this.name = br.readLine();
        this.N = Integer.parseInt(br.readLine());
        LOVE = new int[N][4];
    }

    public void makeTeams() throws IOException {
        teams = new String[N];
        for (int i = 0; i < N; i++) {
            teams[i] = br.readLine();
        }
        Arrays.sort(teams);
    }

    public void cnt() {
        for (int j = 0; j < name.length(); j++) {
            if (name.charAt(j) == 'L'){
                cnt[0]++;
            } else if (name.charAt(j) == 'O') {
                cnt[1]++;
            } else if (name.charAt(j) == 'V') {
                cnt[2]++;
            } else if (name.charAt(j) == 'E') {
                cnt[3]++;
            }
        }

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length(); j++) {
                if (teams[i].charAt(j) == 'L'){
                    LOVE[i][0]++;
                } else if (teams[i].charAt(j) == 'O'){
                    LOVE[i][1]++;
                } else if (teams[i].charAt(j) == 'V'){
                    LOVE[i][2]++;
                } else if (teams[i].charAt(j) == 'E'){
                    LOVE[i][3]++;
                }
            }

            for (int j = 0; j < 4; j++) {
                LOVE[i][j] += cnt[j];
            }
        }
    }
    // ((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E)) mod 100
    public void result() {
        String answer ="";
        int max = -1;
        int[] score = new int[teams.length];

        for (int i = 0; i < score.length; i++) {
            score[i] = 1;
            for (int j = 0; j < 4; j++) {
                for (int k = j+1; k < 4; k++) {
                    score[i] *= LOVE[i][j] + LOVE[i][k];
                }
            }
            score[i] %= 100;
            if (score[i] > max) {
                max = score[i];
                answer = teams[i];
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        T.makeTeams();
        T.cnt();
        T.result();
    }
}