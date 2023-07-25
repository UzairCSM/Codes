package QueueB;
import java.util.*;
public class QueueReversal {
    static Queue<Integer> queue;

    public static void queuerev(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
        static Queue<Integer> reverseQueue(Queue<Integer> q) {
            // Base case
            if (q.isEmpty())
                return q;

            // Dequeue current item (from front)
            int data = q.peek();
            q.remove();

            // Reverse remaining queue
            q = reverseQueue(q);

            // Enqueue current item (to rear)
            q.add(data);

            return q;
        }



    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(reverseQueue(q));


    }

}
