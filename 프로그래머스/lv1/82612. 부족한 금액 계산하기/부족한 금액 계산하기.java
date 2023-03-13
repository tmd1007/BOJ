class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        long total = 0;
        int cnt = 1;

        while(count != 0){
            total = total + (long)price * cnt;
            cnt++;
            count--;
        }

        if (money >= total)
            return 0;

        answer -= total;


        return -answer;
    }
}