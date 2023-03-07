class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("ye", "2");
            babbling[i] = babbling[i].replace("woo", "3");
            babbling[i] = babbling[i].replace("ma", "4");
            if (babbling[i].matches("\\d+"))
                if (A(babbling[i]))
                    answer++;
        }
        return answer;
    }

    public static boolean A(String arr){
        for (int i = 0; i < arr.length(); i++) {
            char c = arr.charAt(i);
            for (int j = 0; j < arr.length(); j++) {
                if(i != j && c == arr.charAt(j))
                    return false;
            }
        }
        return true;
    }

}