
class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;

        while(cnt != n){
            answer++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }

            cnt++;
        }

        return answer;
    }
}