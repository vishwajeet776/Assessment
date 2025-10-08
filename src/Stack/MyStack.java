package Stack;
class stack{
    int data;
    stack next;

    public stack(int data) {
        this.data = data;
        this.next =null;
    }
}
public class MyStack {
    private stack top;

    public boolean isEmpty(){
        if (top==null){
            return true;
        }
        return false;
    }

    public void push(int data){
        stack newNode=new stack(data);
        if (isEmpty()){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    public int peek(){
        if (top==null){
            System.out.print("empty stack ");
            return -1;
        }
        stack temp=top;
        return temp.data;
    }

    public int pop( ) {
        if (isEmpty()){
            System.out.print("empty stack ");
            return -1;
        }
        int a=top.data;
        top=top.next;
        return a;
    }

    public void print(){
        if (isEmpty()){
            System.out.print("empty stack ");
            return;
        }
        stack temp=top;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        return;
    }


    public static void main(String[] args) {
        MyStack stack_=new MyStack();
        System.out.println(stack_.peek());

        stack_.push(1);
        stack_.push(2);
        stack_.push(3);
        stack_.push(4);
        stack_.push(5);
        stack_.push(6);
        stack_.push(8);

        System.out.println(stack_.peek());

        System.out.println(stack_.pop());
        System.out.println(stack_.peek());
        System.out.println(stack_.isEmpty());

        stack_.print();

        stack_.push(8);

        stack_.print();



    }
}
