class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "1");
            babbling[i] = babbling[i].replaceAll("ye", "2");
            babbling[i] = babbling[i].replaceAll("woo", "3");
            babbling[i] = babbling[i].replaceAll("ma", "4");

            if (isNum(babbling[i])){
                if (babbling[i].length() == 1) {
                    answer++;
                } else if (hasDup(babbling[i]))
                    answer++;
            }
        }

        return answer;
    }

    public static boolean isNum(String s){
        try{
            int n = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean hasDup(String s){
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1))
                return false;
        }

        return true;
    }
}