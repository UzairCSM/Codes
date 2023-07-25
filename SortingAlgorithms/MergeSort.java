package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] new_array=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]>=right[j]){
                new_array[k]=right[j];
                j++;
            }
            else{
                new_array[k]=left[i];
                i++;
            }
            k++;
        }
        while(i< left.length){
            new_array[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            new_array[k]=right[j];
            j++;
            k++;
        }
        return new_array;
    }

    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

}
