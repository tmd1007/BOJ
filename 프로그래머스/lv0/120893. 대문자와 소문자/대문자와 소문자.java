class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) - 'Z' > 0)
                answer = answer.concat(String.valueOf(my_string.charAt(i)).toUpperCase());
            else 
                answer = answer.concat(String.valueOf(my_string.charAt(i)).toLowerCase());
        }

        return answer;
    }
}