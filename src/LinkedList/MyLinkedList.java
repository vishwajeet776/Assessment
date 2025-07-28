package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

public class MyLinkedList {
    Node head;
    public void insertEnd(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void printList(){
        Node temp=head;
        if (temp.next == null){
            System.out.println("empty linked list");
        }
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
            System.out.println("empty linked list");
            return false;
        }
        while (temp !=null){
            if (temp.data==num){
//                System.out.println("found at "+count+" number");
                return true;
            }
            temp=temp.next;
            count++;
        }
        return false;
    }
    public void delete(int num) {
        if (!search(num)){
            System.out.println("number does not exist ");
            return;
        }
        Node current = head;
        Node prev=null;
        while(current!=null && current.data!=num){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
    }

    public static void main(String[] args) {

        MyLinkedList linkedList=new MyLinkedList();

        linkedList.insertEnd(5);
        linkedList.insertEnd(7);
        linkedList.insertEnd(8);
        linkedList.insertEnd(3);
        linkedList.insertEnd(1);
        linkedList.insertEnd(9);

        linkedList.printList();
        System.out.println();
        linkedList.insertEnd(2);

        linkedList.printList();
        System.out.println();
        linkedList.addFront(10);
        linkedList.printList();
        System.out.println();

//        System.out.println(linkedList.size());
//        System.out.println(linkedList.search(8));
//        MyLinkedList ll=new MyLinkedList();
//        System.out.println(ll.search(8));

        linkedList.delete(8);
        linkedList.printList();

    }


}
