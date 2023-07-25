package Codechefandleetcode;
import java.util.*;
public class subsequence {
        public static int first=-1;
        public static int last=-1;
        // public static StringBuilder sb1=new StringBuilder();
        public static boolean[] arr=new boolean[26];
        public static ArrayList<String> subsequences(String p, String up) {
            ArrayList<String> list=new ArrayList<>();
            if(up.length()==0){
             // ArrayList<String> list=new ArrayList<>();
              list.add(p);
                return list;
            }
            char curr_char=up.charAt(0);
           ArrayList<String> left= subsequences(p+curr_char,up.substring(1,up.length()));
            ArrayList<String> right=subsequences(p,up.substring(1,up.length()));
//             list.addAll(right);
              list.addAll(left);
             list.addAll(right);
         // left.addAll(right);
            return list;
        }

        public static void main(String[] args) {
            String str="abc";
            ArrayList<String> ans=subsequences("",str);
            System.out.println(ans);
        }
    }

