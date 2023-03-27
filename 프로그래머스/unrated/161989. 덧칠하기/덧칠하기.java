class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] wall = new boolean[n+1];
        int cnt = 0;
        for (int i = 0; i < section.length; i++) {
            wall[section[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (wall[i]){
                for (int j = i; j < i+m; j++) {
                    wall[j] = false;
                    if (j == n)
                        break;
                }
                i += m-1;
                cnt++;
            }
        }

        return cnt;
    }
}