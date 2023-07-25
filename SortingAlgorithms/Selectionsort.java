package SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selectionsort {
    public static void selectionsort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,0};
        selectionsort(arr);
    }
}
