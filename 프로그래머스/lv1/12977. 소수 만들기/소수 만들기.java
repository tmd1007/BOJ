class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum))
                        answer++;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}