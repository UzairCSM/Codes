package SortingAlgorithms;

import java.util.Arrays;

public class mergesortinplace {
    public void sort(int [] arr ,int s,int e){
        if(s<e){
            return;
        }
        int mid=(s+e)/2;
        sort(arr,s,mid);
        sort(arr,mid+1,e);
        merge(arr,s,mid,e);
        System.out.println(Arrays.toString(arr));
    }
    public void merge(int[] arr,int s ,int m,int e){
        int n1=m-s+1;
        int n2=e-m;
        int[] left=new int[n1];
        int [] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[s+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[m+1+j];
        }
        int i=0;
        int j=0;
  //      int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = s;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,32};
    }

}
