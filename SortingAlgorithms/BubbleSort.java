package SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
                  flag=0;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubbleSort(arr);
    }

}
