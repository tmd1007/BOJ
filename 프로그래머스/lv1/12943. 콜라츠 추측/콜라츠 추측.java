class Solution {
    public int solution(int num) {
        int answer = 0;
        long ll = num;
        if (num == 1)
            return answer;

        while(ll != 1){
            ll = ll % 2 == 0 ? ll / 2 : ll * 3 + 1;
            answer++;
            if (answer == 500)
                return -1;
        }

        return answer;
    }
}