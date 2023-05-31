class Solution {
    public int solution(String s) {
        int answer = s.length();
        int cnt = 1;
        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder result = new StringBuilder();
            String base = s.substring(0, i);
            for (int j = i; j <= s.length(); j+=i) {
                int endIdx = Math.min(i + j, s.length());
                String compare = s.substring(j, endIdx);
                if (base.equals(compare)) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        result.append(cnt);
                    }
                    result.append(base);
                    base = compare;
                    cnt = 1;
                }
            }
            result.append(base);
            answer = Math.min(answer, result.length());
        }

        return answer;
    }
}