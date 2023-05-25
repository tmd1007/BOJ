import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        loop :
        while (T-- > 0) {
            String str = br.readLine();
            str = str.replace("RR", "");
            int N = Integer.parseInt(br.readLine());
            List<Integer> arr = new ArrayList<>();
            String nums = br.readLine();
            nums = nums.substring(1, nums.length() - 1);
            StringTokenizer st = new StringTokenizer(nums, ",");
            for (int i = 0; i < N; i++) {
                int n = Integer.parseInt(st.nextToken());
                arr.add(n);
            }

            char[] chars = str.toCharArray();
            boolean cntR = false;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c == 'R') {
                    cntR = !cntR;
                } else {
                    if (arr.size() > 0) {
                        if (!cntR) {
                            arr.remove(0);
                        } else {
                            arr.remove(arr.size() - 1);
                        }
                    } else {
                        sb.append("error").append('\n');
                        continue loop;
                    }
                }
            }

            if (arr.size() > 0) {
                if (cntR) {
                    Collections.reverse(arr);
                }
                sb.append('[');
                for (int i = 0; i < arr.size(); i++) {
                    sb.append(arr.get(i)).append(',');
                }
                sb.deleteCharAt(sb.length()-1).append(']');
            } else {
                sb.append("[]");
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}