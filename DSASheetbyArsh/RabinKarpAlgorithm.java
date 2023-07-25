package DSASheetbyArsh;
import java.util.*;
//public class RabinKarpAlgorithm {
//    public static List<Integer> patternsearching(String s , String p){
//
//        // let us first select a hashfunction suggested by Rabinkarp
//        List<Integer> list=new ArrayList<>();
//        int size=p.length();
//        int temp=size-1;
//        long hash_func=0;
//        long hash_func1=0;
//        for(int i=0;i<size;i++){
//            hash_func+=(p.charAt(i)-'a'+1)*Math.pow(10,temp);
//            temp=temp-1;
//        }
//        temp=size-1;
//        for(int i=0;i<size;i++){
//            hash_func1+=(s.charAt(i)-'a'+1)*Math.pow(10,temp);
//            temp=temp-1;
//        }
//        int i=0;
//        int j=size;
//        while(j<s.length()){
//            if(hash_func1==hash_func){
//                list.add(i);
//            }
//            hash_func1=(long)(hash_func1-((s.charAt(i)-'a'+1)*Math.pow(10,size-1)))*10+(s.charAt(j)-'a'+1);
//            i++;
//            j++;
//        }
//
//    }
//
//}
// i have to study all string matching algorithms

