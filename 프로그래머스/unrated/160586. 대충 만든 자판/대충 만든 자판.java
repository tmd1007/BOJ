import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (map.get(keymap[i].charAt(j)) == null){
                    map.put(keymap[i].charAt(j), j+1);
                } else{
                    map.put(keymap[i].charAt(j), Math.min(map.get(keymap[i].charAt(j)), j+1));
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (map.get(targets[i].charAt(j)) == null){
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(targets[i].charAt(j));
            }
        }
        
        return answer;
    }
}