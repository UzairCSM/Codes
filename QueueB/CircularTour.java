package QueueB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CircularTour {
    public static void interleaves(Queue<Integer> q){
       // Queue<Integer> new_q=new LinkedList<>();
        if(q.size()%2!=0){
            System.out.println("Please Enter even numbers");
            return;
        }
        Stack<Integer> st=new Stack<>();
        int size=q.size()/2;
        for(int i=0;i<size;i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        for(int i=0;i<size;i++){
            q.offer(q.poll());
        }
        for(int i=0;i<size;i++){
            st.push(q.poll());
        }
       while(!st.isEmpty()){
           int val=st.peek();
           st.pop();
           q.offer(val);
           int val1=q.peek();
           q.poll();
           q.offer(val1);
       }
        System.out.println(q);
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
       q.add(20);
        System.out.println(q);
        int a=10;
        int b=7;
        int c=3;
        int ans=++a + b++ + ++c + a++ + ++b + c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ans);
        interleaves(q);
    }

}
