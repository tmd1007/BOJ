import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] ary = my_string.toLowerCase().split("");

        Arrays.sort(ary);

        for (int i = 0; i < ary.length; i++) {
            answer += ary[i];
        }

        
        return answer;
    }
}