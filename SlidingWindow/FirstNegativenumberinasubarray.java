package SlidingWindow;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FirstNegativenumberinasubarray {

    public static void firstneg(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] < 0) {
                q.add(arr[j]);
            }
            if (j - i + 1 == k) {
                if (q.isEmpty()) {
                    System.out.print(0+" ");
                } else {
                    System.out.print(q.peek()+" ");
                }
                if ( !q.isEmpty() && arr[i] == q.peek()) {
                    q.remove();
                }
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        firstneg(arr, 3);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(1);
        pq.add(11);
        pq.add(2);
        pq.add(13);
        System.out.println(pq);
    }
}
