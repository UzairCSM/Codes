package SortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void insertionsort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        Integer [] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // insertionsort(arr);
        //Reverse order sort
        Arrays.sort(arr, Collections.reverseOrder());
    }
}