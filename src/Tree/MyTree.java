package Tree;
class Tree{
    int data;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}


public class MyTree {
    Tree root;
    public void insert(int  data){
        Tree newTree=new Tree(data);
        if (root==null){
            root=newTree;
            return;
        }

    }

    public static void main(String[] args) {

    }
}
