class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length -1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                String tmp = strings[i];
                if (strings[i].charAt(n) > strings[j].charAt(n)){
                    strings[i] = strings[j];
                    strings[j] = tmp;
                } else if (strings[i].charAt(n) == strings[j].charAt(n)){
                    if (strings[i].compareTo(strings[j]) > 0){
                        strings[i] = strings[j];
                        strings[j] = tmp;
                    }
                }
            }
        }

        return strings;
    }
}