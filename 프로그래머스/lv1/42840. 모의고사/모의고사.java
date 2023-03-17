import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = new int[answers.length];
        int[] p2 = new int[answers.length];
        int[] p3 = new int[answers.length];
        int[] p2Num = new int[]{1,3,4,5};
        int[] p3Num = new int[]{3,1,2,4,5};
        int[] answer = new int[3];
        int idx = 0;
        for (int i = 0; i < p1.length; i++) {
            p1[i] = i % 5 + 1;
            if (p1[i] == answers[i])
                answer[0]++;
            p3[i] = p3Num[idx % 5];
            if (p3[i] == answers[i])
                answer[2]++;
            if (i % 2 ==0)
                p2[i] = 2;
            else {p2[i] = p2Num[idx % 4];
                idx++;
            }
            if (p2[i] == answers[i])
                answer[1]++;
        }

        int max = answer[0];

        for (int i = 0; i < answer.length; i++) {
            if (max < answer[i])
                max = answer[i];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == max)
                list.add(i + 1);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        Arrays.sort(result);

        return result;
    }
}