package Codechefandleetcode;
import java.util.*;

public class MergeSort {
        public static int[] Divide(int arr[]) {
            if(arr.length==1){
                return arr;
            }
            int mid=arr.length/2;
            int[] left=Divide(Arrays.copyOfRange(arr,0,mid));
            int[] right=Divide(Arrays.copyOfRange(arr,mid,arr.length));
            return merge(left,right);

        }

        public static int[] merge(int[] left,int[] right) {
            int[] newArray=new int[left.length+right.length];
            int i=0;
            int j=0;
            int k=0;

            while(i<left.length && j<right.length){
                if(left[i]<=right[j]){
                    newArray[k]=left[i];
                    i++;
                }
                else{
                    newArray[k]=right[j];
                    j++;
                }
                k++;
            }
            while(i<left.length){
                newArray[k]=left[i];
                i++;
                k++;
            }
            while(j<right.length){
                newArray[k]=right[j];
                j++;
                k++;
            }
            return newArray;
        }

        public static void main(String[] args) {
            int arr[] = {4, 67, 2, 1, 6};
            int n = arr.length;
            String ans= Arrays.toString(Divide(arr));
            System.out.println(ans);
        }
    }
