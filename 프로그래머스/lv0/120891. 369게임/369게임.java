class Solution {
    public int solution(int order) {
        int answer = 0;

        for (int i = 0; i < String.valueOf(order).length(); i++) {
            int n = Integer.parseInt(String.valueOf(order).substring(i,i+1));
            if(n == 3 || n == 6 || n == 9)
                answer++;
        }

        return answer;
    }
}