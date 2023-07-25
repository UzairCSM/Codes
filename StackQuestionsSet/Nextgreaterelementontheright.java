package StackQuestionsSet;

import java.util.Arrays;
import java.util.Stack;

//Suppose you are given a number n, representing the size of array a. After that you are given n numbers, representing elements of array a.
//
//        You are required to return an array which consists of "next greater element to the right" corresponding to all elements of the array.
//
//        Input and output is already handled for you.
//
//        "Next greater element on the right" of an element x is defined as the first element to the right of x having value greater than x. Note -> If an element does not have any element on its right side greater than it, consider -1 as it's "next greater element on right"
//
//
//        e.g.
//
//        for the array [2 5 9 3 1 12 6 8 7]
//
//        Next greater for 2 is 5
//
//        Next greater for 5 is 9
//
//        Next greater for 9 is 12
//
//        Next greater for 3 is 12
//
//        Next greater for 1 is 12
//
//        Next greater for 12 is -1
//
//        Next greater for 6 is 8
//
//        Next greater for 8 is -1
//
//        Next greater for 7 is -1
public class Nextgreaterelementontheright {
    public static void main(String[] args) {
        int[] nums={2,5,9,3,1,12,6,8,7};
        int[] ans=new int[nums.length];
        Stack<Integer> st= new Stack<>();
  //      Stack<Integer> st1=new Stack<>();
        for(int i= nums.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(nums[i]);
               // st1.push(-1);
                ans[i]=-1;
            }
            else if(st.peek()<nums[i]){
                while(!st.isEmpty() && st.peek()<nums[i]){
                    st.pop();
                   // System.out.println(st.peek());
                }
                if(st.isEmpty()){
                   // st1.push(-1);
                    ans[i]=-1;
                    st.push(nums[i]);
                }
                else if(!st.isEmpty()){
                   //st1.push(st.peek());
                    ans[i]= st.peek();
                    st.push(nums[i]);
                }
            }
            else if(st.peek()>nums[i]){
              // st1.push(st.peek());
                ans[i]=st.peek();
                st.push(nums[i]);
            }
        }
        System.out.println(Arrays.toString(ans));
        // System.out.println(st1);
    }
}
