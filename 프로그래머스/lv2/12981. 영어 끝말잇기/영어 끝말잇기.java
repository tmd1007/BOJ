import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> set = new HashSet<>();

        String prev = words[0], next;
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            next = words[i];

            if (prev.charAt(prev.length() - 1) != next.charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }

            if (!set.contains(words[i])) {
                set.add(words[i]);
            } else {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }

            prev = next;
        }

        return answer;
    }
}