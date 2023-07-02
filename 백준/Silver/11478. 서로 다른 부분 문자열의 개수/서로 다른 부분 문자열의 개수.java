import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder s = new StringBuilder(str);
        HashSet<String> set = new HashSet<>();
        int idx = 0;
        int len = str.length();

        while(idx <= len) {
            idx++;
            for (int i = 0; i < len - idx + 1; i++) {
                String ss = s.substring(i, i + idx);
                set.add(ss);
            }
        }

        System.out.println(set.size());
    }
}