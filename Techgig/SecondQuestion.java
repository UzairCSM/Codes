package Techgig;

import java.util.Scanner;

public class SecondQuestion {
    public static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        String S = input.next();
        int[] dp = new int[N + 1];
        dp[N] = 1;

        for (int i = N - 1; i >= 0; --i) {
            if (S.charAt(i) == '0') {
                continue;
            }
            long num = 0;
            for (int j = i; j < N; ++j) {
                num = num * 10 + (S.charAt(j) - '0');
                if (num > K) {
                    break;
                }
                dp[i] = (dp[i] + dp[j + 1]) % MOD;
            }
        }

        System.out.println(dp[0]);
        input.close();
    }
}