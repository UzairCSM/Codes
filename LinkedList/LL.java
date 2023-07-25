package LinkedList;

import javax.print.DocFlavor;
import java.awt.geom.Line2D;

public class LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public  static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
   public void print(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
       System.out.println("null");
   }
   // linear time index ko dhundhna padega
    // add in the middle
    // loop to index-1;

   public void add(int index,int data){
        if(index==0){
           addFirst(data);
           return;
        }
        Node temp=head;
       Node newnode =new Node(data);
       size++;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        Node nextnode=temp.next;
        temp.next=newnode;
        newnode.next=nextnode;
   }
   public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
   }
   // loop to size-2
  public int removeLast(){
      if(size==0){
          System.out.println("Linked list is Empty");
          return Integer.MIN_VALUE;
      }
      else if(size==1){
          int val=head.data;
          head=tail=null;
          size=0;
          return val;
      }
      Node prev=head;
      for(int i=0;i<size-2;i++){
          prev=prev.next;
      }
      int val=prev.next.data;
      prev.next=null;
      tail=prev;
      size--;
      return val;
  }
  // here we are performing linear search
 public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
 }
 public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
 }
 // Main Condition is curr_node!=null
 public void reverse(){
        Node prev=head;
        Node curr_node=head.next;
        while(curr_node!=null){
            Node nextnode=curr_node.next;
            curr_node.next=prev;
            prev=curr_node;
            curr_node=nextnode;
        }
        head.next=null;
        head=prev;
 }


 public int recsearch(int key){

        return helper(head,key);
 }
public boolean checkpalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=slow;
        Node curr_node=slow.next;
        while(curr_node!=null){
            Node nextnode=curr_node.next;
            curr_node.next=prev;
            prev=curr_node;
            curr_node=nextnode;
        }
        slow.next=null;
        int flag=0;
        Node temp=head;
        while(prev!=null){
            if(temp.data==prev.data){
                temp=temp.next;
                prev=prev.next;
            }
            else{
                flag=1;
                break;
            }
        }
    //System.out.println(head);
        if(flag==1){
            return false;
        }
        return true;
}
  // FLoyd Cycle finding Algorithm
    public static void removecycle(){
        if(head==null && head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(!cycle){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;

    }

    public static void main(String[] args) {
    LL linkedlist=new LL();
    linkedlist.print();
    linkedlist.addFirst(2);
    linkedlist.print();
    linkedlist.addFirst(1);
    linkedlist.print();
    linkedlist.addlast(3);
    linkedlist.print();
    linkedlist.addlast(4);
    linkedlist.print();
    linkedlist.add(2,5);
    linkedlist.print();
    System.out.println(linkedlist.size);
    int val=linkedlist.removeFirst();
    System.out.println(val);
    linkedlist.print();
    System.out.println(linkedlist.size);
    System.out.println(linkedlist.removeLast());
    linkedlist.print();
    System.out.println(linkedlist.size);
    System.out.println(linkedlist.itrsearch(2));
    linkedlist.addFirst(5);
    linkedlist.addFirst(8);
    linkedlist.addFirst(9);
    linkedlist.addFirst(10);
    linkedlist.print();
    linkedlist.reverse();
    linkedlist.print();
    linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.print();
        linkedlist.addlast(1);
        linkedlist.addlast(2);
        linkedlist.addlast(2);
        linkedlist.addlast(1);
        linkedlist.print();
        System.out.println(linkedlist.checkpalindrome());




    }
}
