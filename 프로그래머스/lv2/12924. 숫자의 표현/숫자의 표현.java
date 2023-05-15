class Solution {
    public int solution(int n) {
        int[] arr = new int[n+1];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        int left = 1, right = 1;
        while(right <= n) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += arr[i];
            }

            if (sum == n) {
                cnt++;
                right++;
            } else if (sum < n) {
                right++;
            } else {
                left++;
            }
        }

        return cnt;
    }
}