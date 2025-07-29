package LinkedList;

class DNode{
    int data;
    DNode prev;
    DNode next;
    public DNode(int data){
        this.data=data;
        this.prev=next=null;
    }
}
public class DoublyLinkedList {

    DNode head;

    public static void main(String[] args) {
        DoublyLinkedList Dll=new DoublyLinkedList();

//        insert
        Dll.insert(5);
        Dll.insert(4);
        Dll.insert(1);
        Dll.insert(3);
        Dll.insert(7);
        Dll.printForward();
        System.out.println();


//        addFront
        Dll.addFront(8);
        Dll.addFront(6);
        Dll.printForward();
        System.out.println();


//        printBackWord
        Dll.printBackWord();
        System.out.println();

        Dll.printForward();
        System.out.println();
        System.out.println(Dll.NthNodeEnd(3));


    }

    private void printBackWord() {
        DNode tail=head;
        if (head == null){
            return;
        }
        while (tail.next != null){
            tail=tail.next;
        }

        while (tail !=null){
            System.out.print(tail.data+" ");
            tail=tail.prev;
        }
    }

    private int NthNodeEnd(int k) {
        DNode tail=head;
        int count=0;

        if ( k<=0) {
            return 0;
        }

        if (head == null){
            return 0;
        }

        while (tail.next != null){
            tail=tail.next;
        }

        while (tail !=null){
           if (count==k){
               return tail.data;
           }
            count++;
            tail=tail.prev;
        }
        return 0;
    }


    public void addFront(int i) {
        DNode newNode=new DNode(i);

        if (head != null){
            newNode.next=head;
            head.prev=newNode;
        }

        head=newNode;
    }

    private void printForward() {
        DNode temp=head;
        if (head==null){
            System.out.println("empty linked List");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private void insert(int i) {
        DNode newNode=new DNode(i);
        DNode temp=head;
        if (head==null){
            head=newNode;
            return;
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
}
