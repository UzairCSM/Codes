package QueueB;

import java.util.Queue;

public class QueueImplementation {
    static class Node{
        int data;
        Node next;
      Node(int data){
      this.data=data;
      this.next=null;
      }
    }
    static  class Queue{
    static int[] arr;
    static int size;
    static  int rear;
      Queue(int n){
          // array implementation queue is of fixed size that is the drawback of array Implementation
          arr=new int[n];
          size=n;
          rear=-1;
      }
      public static boolean isEmpty(){
          return rear==-1;
      }
      public static void add(int data){ // O(1)
          if(rear==size-1){
              System.out.println("Queue is Full");
              return;
          }
          rear=rear+1;
          arr[rear]=data;
      }
      public static int remove(){  // remove in case of array Implementation is O(n)
          if(isEmpty()){
              System.out.println("Queue is Empty");
              return -1;
          }
          int front=arr[0];
          for(int i=0;i<rear;i++){
              arr[i]=arr[i+1];
          }
          rear--;
          return front;
      }
     public static int peek(){ // O(1)
          if(isEmpty()){
              System.out.println("Queue is Empty");
              return -1;
          }
          return arr[0];
     }

    }
    static  class CircularQueue{
        static int[] arr;
        static int size;
        static  int rear;
        static int front;
        CircularQueue(int n){
            // array implementation queue is of fixed size that is the drawback of array Implementation
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){

            return rear==-1 && front==-1;
        }
        public static boolean isFull(){

            return (rear+1)%size==front;
        }

        public static void add(int data){ // O(1)
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            // add 1st element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){  // remove in case of array Implementation is O(n)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result=arr[front];
            if(front==rear){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){ // O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

    }
    static class QueueUsingLinkedList{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){ //o(1)
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result=head.data;
            if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
            return result;
        }
        public static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }


    }


    public static void main(String[] args) {
        QueueUsingLinkedList q=new QueueUsingLinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

           }
}
