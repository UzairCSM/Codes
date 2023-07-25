package RecursionQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblems {
     public static boolean isSorted(int [] arr,int index){
         if(index==arr.length-1){
             return true;
         }

         return arr[index]<arr[index+1] && isSorted(arr,index+1);
     }
    public static boolean linearSearch(int[] arr,int ind,int target){
         if(ind==arr.length){
             return false;
         }
         return arr[ind]==target || linearSearch(arr,ind+1,target);
    }
    public static int linearSearch1(int[] arr,int ind,int target){
         if(ind==arr.length) {
             return -1;
         }
        if (arr[ind]==target){
            return ind;
        }
        return linearSearch1(arr,ind+1,target);
    }
    //when you have to return an arrayList
    // first way make arrayList outside function as static and prints that list in main
    // pass an arraylist in the arguments and returns an arraylist
    static ArrayList<Integer> list=new ArrayList<>();
     public static void findallindexes(int[] arr,int target,int index){
         if(index==arr.length){
             return;
         }
         if(arr[index]==target){
             list.add(index);
         }
         findallindexes(arr,target,index+1);
     }
     // Second Way to do the same
    public static ArrayList findallind(int[] arr,int target,int index,ArrayList<Integer> list){
         if(index==arr.length){
             return list;
         }
         if(arr[index]==target){
             list.add(index);
         }
          return findallind(arr,target,index+1,list);
    }

     // using the third method where we have new ArrayList at every function call
    public static ArrayList findallnew(int [] arr,int index ,int target){
        ArrayList<Integer> list2=new ArrayList<>();
         if(index==arr.length){
             return list2;
         }
      //  ArrayList<Integer> list=new ArrayList<>();
         if(arr[index]==target){
             list2.add(index);
         }
         ArrayList<Integer> answerfrombelowcalls=findallnew(arr,index+1,target);
         answerfrombelowcalls.addAll(list2);
         return answerfrombelowcalls;

    }



    public static void main(String[] args) {
         ArrayList<Integer> list1=new ArrayList<>();
        int[] arr={1,2,4,1,9,8,7,6,5,9};
        int index=0;
        int target=9;
        System.out.println(isSorted(arr,0));
        System.out.println(linearSearch1(arr,index,target));
        findallindexes(arr,9,0);
        System.out.println(list);
        System.out.println(findallind(arr,9,0,list1));
        System.out.println(findallnew(arr,0,9));
    }

}
