package LeetCode;

import java.util.Scanner;

public class DiceCombinations {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];

        dp[0] = 1; // Base case: 1 way to get sum 0 (do nothing)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    dp[i] = (dp[i] + dp[i - j]) % MOD;
                }
            }
        }

        System.out.println(dp[n]);
    }
}
