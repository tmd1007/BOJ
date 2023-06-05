import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Deque<Integer> dq = new ArrayDeque<>();

        Arrays.sort(people);
        
        for (int i = 0; i < people.length; i++) {
            dq.add(people[i]);
        }

        int cnt = 0;
        while(!dq.isEmpty()) {
            if (dq.getFirst() + dq.getLast() <= limit) {
                dq.pollFirst();
                dq.pollLast();
                cnt++;
            } else {
                dq.pollLast();
                cnt++;
            }
        }
        return cnt;
    }
}