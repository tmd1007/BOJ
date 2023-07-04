import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Word> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() >= M) {
                if (!set.contains(s)) {
                set.add(s);
                map.put(s, idx);
                list.add(new Word(s, 1, idx));
                idx++;
                } else {
                    list.get(map.get(s)).cnt++;
                }
            }
        }

        list.sort(new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if (o1.cnt == o2.cnt) {
                    if (o1.name.length() == o2.name.length()) {
                        return o1.name.compareTo(o2.name);
                    } else {
                        return o2.name.length() - o1.name.length();
                    }
                } else {
                    return o2.cnt - o1.cnt;
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Word word : list) {
            sb.append(word.name).append('\n');
        }

        System.out.println(sb);
    }
}

class Word {
    String name;
    int cnt;
    int idx;
    public Word(String name, int cnt, int idx) {
        this.name = name;
        this.cnt = cnt;
        this.idx = idx;
    }
}