package DynamicProgramming;

import java.util.Scanner;
import java.util.*;
public class DPExamples {
    public static int fibonacci(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
        return dp[n];
        // value ko save krne ko hi memoization kehte hai
        // Memoization-->store the value of subproblems in Map/Table
        // Recursion + Memoization --> Top Down Approach
        // parameter 1 to 1D array--> DP Array

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] dp=new int[n+1];
//        for(int i=0;i<=n;i++){
//            dp[i]=-1;
//        }
      //  System.out.println(fibonacci(n,dp));
        //Bottom Up Approach
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
       // space optimization
        int prev1=0;
        int prev2=1;
        int next=0;
        for(int i=2;i<=n;i++){
            next=prev1+prev2;
            prev1=prev2;
            prev2=next;
        }
        System.out.println(next);
    }

}
