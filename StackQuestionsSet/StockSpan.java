package StackQuestionsSet;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int n=8;
        int[] nums={1,2,3,1,2,1,3,5};
        int[] span=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        span[0]=1;
        for(int i=1;i<n;i++){
            //if(nums[i])
            while( st.size()>0 && nums[i]>nums[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
             //   st.push(i);
               // span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
              //  st.push(i);
                //span[i]=i-st.peek();

            }
            st.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
}
