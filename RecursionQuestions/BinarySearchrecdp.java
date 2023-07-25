package RecursionQuestions;

import java.util.Arrays;

public class BinarySearchrecdp {
    public static int binarysearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){

            return binarysearch(arr,target,mid+1,end);
        }
        return binarysearch(arr,target,start,mid-1);
    }

    public static void main(String[] args) {
//         Binary search doesn't do this because it has no repeated subproblems,
//        so it's not a DP algorithm
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=6;
        int start=0;
        int end= arr.length-1;
//        int [] dp=new int[arr.length];
//        Arrays.fill(arr,-1);
        int ans=binarysearch(arr,target,start,end);
        System.out.println(ans);
    }

}
