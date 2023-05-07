import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(solution.delivery(n));


    }
}

class solution {
    public static int delivery(int n){
        int[] dp = new int[5001];
        dp[3] = 1;
        dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            if(dp[i - 3] != 0)
                dp[i] += dp[i-3] + 1;

            if(dp[i - 5] != 0){
                dp[i] = dp[i] == 0 ? dp[i-5] + 1 : Math.min(dp[i-5]+1, dp[i]);
            }
        }

        return dp[n] != 0 ? dp[n] : -1;
    }
}