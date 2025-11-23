package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next = next;
    }
}

public class SingularLinkedList {
    Node head;
    public void insertEnd(int data){
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    public void printList(){
        Node temp=head;
        if (temp == null){
            System.out.println("empty linked list");
        }
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addFront(int data){

        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int size(){
        int count=0;
        if (head==null){
            return 0;
        }
        Node temp=head;
        while (temp !=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public boolean search(int num) {
        int count=0;
        Node temp=head;
        if (temp == null){
            return false;
        }
        while (temp !=null){
            if (temp.data==num){

                return true;
            }
            temp=temp.next;
            count++;
        }
        return false;
    }
   public void delete(int n){

        if (head==null){
            System.out.println("empty list");
            return;
        }

        if (head.data==n){
            head=head.next;
            return;
        }

        Node temp=head;
        Node prev=null;
        while (temp!=null && temp.data != n){
            prev=temp;
            temp=temp.next;
        }

        if (temp==null){
            System.out.println("Node not found");
            return;
        }

        prev.next=temp.next;
   }
    private int NthNode(int k) {

        if (k <= 0) {
            throw new IllegalArgumentException("Index must be >= 1 for 1-based indexing");
        }

        Node temp=head;
        int count=1;
        while (temp !=null){

            if (count==k) {
                return temp.data;
            }
            count++;
            temp=temp.next;

        }
        throw new IndexOutOfBoundsException();
    }


    public static void main(String[] args) {

        SingularLinkedList linkedList=new SingularLinkedList();

        linkedList.insertEnd(5);
        linkedList.insertEnd(7);
        linkedList.insertEnd(8);
        linkedList.insertEnd(3);
        linkedList.insertEnd(1);
        linkedList.insertEnd(9);

//        linkedList.printList();
//        System.out.println();
        linkedList.insertEnd(2);

//        linkedList.printList();
//        System.out.println();
        linkedList.addFront(10);
//        linkedList.printList();

//        System.out.println(linkedList.size());
//        System.out.println(linkedList.search(8));
//        MyLinkedList ll=new MyLinkedList();
//        System.out.println(ll.search(8));

        linkedList.delete(8);
        linkedList.printList();


        System.out.println(linkedList.NthNode(3));

        linkedList.reverse();
        linkedList.printList();

        linkedList.addFront(4);

        linkedList.printList();

        System.out.println(linkedList.middle());

        linkedList.delete(2);
//        linkedList.delete(3);
        linkedList.printList();

    }

    private int middle() {

        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    private void reverse() {

        Node prev=null;
        Node current=head;
        Node next;

        while (current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }


}
