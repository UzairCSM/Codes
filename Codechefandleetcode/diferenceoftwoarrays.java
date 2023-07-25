package Codechefandleetcode;

import java.util.Arrays;
import java.util.Scanner;

public class diferenceoftwoarrays {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] arr=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=scn.nextInt();
        }
        int n2= scn.nextInt();
        int[] arr1=new int[n2];
        for(int i=0;i<n2;i++){
            arr1[i]=scn.nextInt();
        }
        int[] diff=new int[n2];
        int i=n1-1;
        int j=n2-1;
        int k=n2-1;
        int c=0;
        while(k>=0){
            int d=0;
            int alv=i>=0?arr[i]:0;
            if(arr1[j]+c>=alv){
                d=arr1[j]+c-alv;
                c=0;
            }
            else{
                 d=arr1[j]+10+c-alv;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        while (idx< diff.length){
            System.out.println(diff[idx]);
           idx++;
        }
      //  System.out.println(Arrays.toString(diff));
    }
}
