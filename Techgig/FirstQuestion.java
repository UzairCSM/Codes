package Techgig;
import Codechefandleetcode.Codechef;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FirstQuestion {
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

    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        FastReader scn = new FastReader();
        // Read N and P from the input
        int N = scn.nextInt();
        int P = scn.nextInt();
        TreeSet<Integer> hs = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int x = scn.nextInt();
            hs.add(x);
        }
        for (int i = 0; i < P; i++) {
            int y = scn.nextInt();
            hs.add(y);
            output.write(hs.size() - hs.headSet(y).size() + "\n");
            output.flush();
        }
       // output.flush();
    }
}
