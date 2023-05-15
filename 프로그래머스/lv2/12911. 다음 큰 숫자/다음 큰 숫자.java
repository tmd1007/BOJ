class Solution {
    public int solution(int n) {
        int answer = 0;

        String s = Integer.toBinaryString(n);
        int s_Cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                s_Cnt++;
            }
        }
        
        while(true) {
            int num = ++n;
            String b = Integer.toBinaryString(num);
            int b_Cnt = 0;
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == '1') {
                    b_Cnt++;
                }
            }

            if (s_Cnt == b_Cnt) {
                answer = num;
                break;
            }
        }

        return answer;
    }
}