import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            Set<Character> set = new HashSet<>();
            String str = br.readLine();
            int num = 0;
            for (int j = 0; j < str.length(); j++) {
                if (j > 0 && str.charAt(j) != str.charAt(j-1) && set.contains(str.charAt(j))) {
                    break;
                } else {
                    set.add(str.charAt(j));
                    num++;
                }
            }
            if (num == str.length()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}