import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] percent = new double[N+1];
        int people = stages.length;
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]){
                    cnt++;
                }
            }
            percent[i] = (double)cnt / (people == 0 ? 1 : people);
            people -= cnt;
        }

        TreeSet<Double> set = new TreeSet<>();
        for (double val : percent) {
            set.add(val);
        }
        int idx = 0;
        Double[] r = set.toArray(new Double[set.size()]);
        int[] result = new int[N];
        for (int i = 0; i < r.length; i++) {
            for (int j = 1; j < percent.length; j++) {
                if (r[r.length-1 -i] == percent[j]){
                    result[idx] = j;
                    idx++;
                }
            }
        }
        return result;
    }
}