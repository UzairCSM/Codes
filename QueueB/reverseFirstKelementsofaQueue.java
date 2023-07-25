package QueueB;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class reverseFirstKelementsofaQueue {
    // Function to reverse first k elements of the queue
        public static void reverseFirstK(Queue<Integer> q, int k){
            Deque<Integer> d = new ArrayDeque<>();

            // Dequeue the first k elements of the queue and
            // push them onto a deque
            for (int i = 0; i < k; i++) {
             //   System.out.println(q.peek());
                d.push(q.poll());
            }
            System.out.println(d);

            // Pop the elements from the deque and enqueue them
            // back into the queue
            while (!d.isEmpty()) {
                q.add(d.pop());
            }

            // Dequeue the remaining elements from the queue and
            // enqueue them back into the queue
            for (int i = 0; i < q.size() - k; i++) {
                q.add(q.poll());
            }
        }

        // Driver code.
        public static void main(String[] args){
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(10);
            q.add(20);
            q.add(30);
            q.add(40);
            q.add(50);
            q.add(60);
            q.add(70);
            q.add(80);
            q.add(90);
            q.add(100);
            System.out.println(q);
            int k = 5;

            // function call.
            reverseFirstK(q, k);

            while (!q.isEmpty()) {
                System.out.print(q.peek() + " ");
                q.poll();
            }
        }
    }

