import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String key : participant) {
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        for (String key : completion) {
            hm.put(key, hm.get(key) -1);
        }

        for (Map.Entry<String, Integer> key: hm.entrySet()) {
            if (key.getValue() != 0)
                return key.getKey();
        }

        return "";
    }
}