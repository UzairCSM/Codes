package Codechefandleetcode;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codechef {
    static long M = 1000000007;

    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hcf(b, a % b);
        }
    }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static int[] suffixsum(int[] arr, int n) {
        int[] suffixSum = new int[n];
        for (int i = 0; i < n; i++) {
            suffixSum[i] = 0;
        }
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        return suffixSum;
    }

    public static boolean isPowerOftwo(int n) {
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                cnt++;
            }
            n = n >> 1;
        }
        if (cnt == 1) {
            return true;
        }
        return false;
    }


    static int nCr(int n, int r) {
        return (int) (fact(n) / ((fact(r) *
                fact(n - r)) % M) % M);
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = (int) ((res * i) % M);
        return res;
    }

    static int fact1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }


    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        FastReader scn = new FastReader();
        int t = scn.nextInt();
        while (t-- > 0) {
            int n= scn.nextInt();
            String str= scn.next();
            HashSet<Character> hs=new HashSet<>();
            for(int i=0;i<n;i++){
                hs.add(str.charAt(i));
            }
            if(hs.size()==1){
                //ans=YES;
            }
            else if(hs.size()==n){
               // ans=N0;
            }
            else{
                
            }
        }
    }
}

