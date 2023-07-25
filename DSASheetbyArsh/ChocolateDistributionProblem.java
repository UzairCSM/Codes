package DSASheetbyArsh;
import java.util.*;
public class ChocolateDistributionProblem {
    public static int minimum_difference(int[] arr,int n,int m){
        Arrays.sort(arr);
        int diff=arr[m-1]-arr[0];
        int i=1;
        int j=m;
        int min=diff;
        while(j<n){
            diff=arr[j]-arr[i];
            min=Math.min(min,diff);
            j++;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=5;
        int n=arr.length;
        System.out.println(minimum_difference(arr,n,m));
    }


}
