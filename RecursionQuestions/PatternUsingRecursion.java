package RecursionQuestions;

import java.util.Arrays;

public class PatternUsingRecursion {
    public static void pattern(int no_of_rows,int no_of_columns) {
        if (no_of_rows == 0) {
            return;
        }

        if (no_of_rows > no_of_columns) {
            //System.out.print("*" + " ");
            pattern(no_of_rows, no_of_columns + 1);
            System.out.print("*" + " ");
        } else {
            pattern(no_of_rows - 1, 0);
            System.out.println();

        }
        // }
    }
    public static void BubblesortRec(int[] arr,int c,int r){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            BubblesortRec(arr,c+1,r);
        }
        else{
            BubblesortRec(arr,0,r-1);
        }
       // System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int [] arr,int c ,int r ,int max){
        // Here we make use of that put the largest element to the rightmost and reduce the search space by 1
       if(r==0){
           return;
       }
        if(c<r){
            if(arr[c]>arr[max]){
                max=c;
                SelectionSort(arr,c+1,r,max);
            }
            else if(arr[c]<=arr[max]){
                SelectionSort(arr,c+1,r,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            SelectionSort(arr,0,r-1,0);
        }

    }

    // in case of recursion try to make if there is a scenerio of row columns
    public static void main(String[] args) {
        int no_of_rows=5;
        int no_of_columsn=5;
        int[] arr={5,4,3,2,1};
       // pattern(5,0);
        //BubblesortRec(arr,0,4);
        SelectionSort(arr,0,5,0);
        System.out.println(Arrays.toString(arr));
    }
}
