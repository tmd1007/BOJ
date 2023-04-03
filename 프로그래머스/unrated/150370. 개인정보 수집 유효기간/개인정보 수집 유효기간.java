import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int today_Y = Integer.parseInt(today.split("\\.")[0]) - 2000;
        int today_M = Integer.parseInt(today.split("\\.")[1]);
        int today_D = Integer.parseInt(today.split("\\.")[2]);
        int today_All = (today_Y * 12 * 28) + (today_M * 28) + today_D;
        for (String str : terms) {
            String[] s = str.split(" ");
            map.put(s[0], Integer.parseInt(s[1]));
        }

        int[] pri_Y = new int[privacies.length];
        int[] pri_M = new int[privacies.length];
        int[] pri_D = new int[privacies.length];

        for (int i = 0; i < privacies.length; i++) {
            String[] pri_ = privacies[i].split(" ");
            pri_Y[i] = Integer.parseInt(pri_[0].split("\\.")[0]) - 2000;
            pri_M[i] = Integer.parseInt(pri_[0].split("\\.")[1]);
            pri_D[i] = Integer.parseInt(pri_[0].split("\\.")[2]);
            int pri_All = (pri_Y[i] * 12 * 28) + (pri_M[i] * 28) + pri_D[i] + (map.get(pri_[1]) * 28);

            if (today_All >= pri_All)
                list.add(i+1);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}