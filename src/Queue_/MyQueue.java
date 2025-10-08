package Queue_;
class queue{
    int data;
    queue next;

    public queue(int data) {
        this.data = data;
        this.next=null;
    }
}

public class MyQueue {
    queue front,rare=null;
    public void push(int data){
        queue newQueue=new queue(data);
        if (front==null && rare==null){
            front=rare=newQueue;
            return;
        }
        rare.next=newQueue;
        rare=newQueue;
        return;
    }
    public int pop(){
        if (front==null){
            throw new RuntimeException("Empty queue");
        }
        int a=front.data;
        front=front.next;
        return a;
    }
    public static void main(String[] args) {

    }
}
