class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int change = 0;
        while(!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    cnt++;
                }
            }

            s = s.replace("0", "");
            int n = s.length();
            s = Integer.toString(n, 2);

            change++;
        }

        return new int[]{change, cnt};
    }
}