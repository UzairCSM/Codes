package Codechefandleetcode;
import java.util.*;

public class Solution {
    public static String sortVowels(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                list.add((int)ch);

            }
        }
        Collections.sort(list);
        System.out.println(list);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            int ch=list.get(i);
            sb.append((char)ch);
        }
        int pos=0;
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                sb1.append(sb.charAt(pos++));

            }
            else{
                sb1.append(ch);
            }
        }
        return sb1.toString();
    }
    public static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }

    public static void main(String[] args) {
      String str="lEetcOde";
        System.out.println(sortVowels(str));

    }
    }
