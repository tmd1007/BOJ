import java.util.*;


class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
            map2.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            String change = map2.get(map.get(callings[i]) -1);
            map.replace(callings[i], map.get(callings[i]) -1);
            map.replace(change, map.get(change) + 1);
            
            map2.put(map.get(callings[i]), callings[i]);
            map2.put(map.get(change), change);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map2.get(i);
        }
        
        return answer;
    }
}