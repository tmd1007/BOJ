
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = new ArrayList<>(new HashSet<>(List.of(report)));
        HashMap<String, Integer> numOfReport = new HashMap<>();
        HashMap<String, ArrayList<String>> reporter = new HashMap<>();
        for (String str : id_list) {
            numOfReport.put(str, 0);
            reporter.put(str, new ArrayList<>() );
        }

        for (int i = 0; i < list.size(); i++) {
            String[] split = list.get(i).split(" ");
            ArrayList<String> reportList = reporter.get(split[0]);
            reportList.add(split[1]);
            numOfReport.put(split[1], numOfReport.get(split[1]) + 1);
            reporter.put(split[0], reportList);
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            int l = reporter.get(id_list[i]).size();
            for (int j = 0; j < l; j++) {
                if(numOfReport.get(reporter.get(id_list[i]).get(j)) >= k)
                    answer[i]++;
            }
        }
        return answer;
    }
}