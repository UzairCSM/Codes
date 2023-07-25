package RecursionQuestions;

import java.util.Arrays;

public class FibonaciiUsingDp {
    public static int Fibdp(int n,int[] dp){
        if(n<2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=Fibdp(n-1,dp)+Fibdp(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n=32;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Fibdp(n,dp));
    }


}
