class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        answer += Integer.parseInt(str[0]);
        for (int i = 0; i < str.length-2; i = i + 2) {
            if(str[i+1].equals("+"))
                answer += Integer.parseInt(str[i+2]);
            else
                answer -= Integer.parseInt(str[i+2]);
        }

        return answer;
    }
}