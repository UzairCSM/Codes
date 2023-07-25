package QueueB;
import java.util.*;
public class DequeExamples {
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addLast(3);
        deq.addLast(4);
        System.out.println(deq); //[2,1]
        System.out.println(deq.removeFirst());//[2]
        System.out.println(deq.removeLast());
        System.out.println(deq.getFirst());
        System.out.println(deq.getLast());
    }
}
