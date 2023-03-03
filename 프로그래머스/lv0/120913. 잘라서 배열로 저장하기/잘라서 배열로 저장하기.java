class Solution {
    public String[] solution(String my_str, int n) {
        int idx = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;

        String[] answer = new String[idx];
        int num = 0;
        for (int i = 0; i < answer.length-1; i++) {
            answer[i] = my_str.substring(num, n*(i+1));
            num += n;
        }
        
        answer[idx-1] = my_str.substring(num);

        return answer;
    }
}