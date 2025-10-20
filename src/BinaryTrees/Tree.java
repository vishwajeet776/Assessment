package BinaryTrees;

class TreeNode{
     int data=10;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree{

    private TreeNode root;

    public void add(int data){
        root=addRecursive(root,data);
    }

    private TreeNode addRecursive(TreeNode root, int data) {
        if (root==null){
            return new TreeNode(data);
        }
        if (data< root.data){
           root.left= addRecursive(root.left,data);
        }else {
           root.right= addRecursive(root.right,data);
        }
        return root;
    }

    public void inorder(){
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(TreeNode root) {
        if (root==null){
            return;
        }
        inorderRecursive(root.left);
        System.out.print(root.data+" ");
        inorderRecursive(root.right);
    }

    public void preOrder(){
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(TreeNode root) {
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void postOrder(){
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(TreeNode root) {
        if (root==null){
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data+" ");
    }

    public boolean search(int data){
        return searchRecursive(root,data);
    }

    private boolean searchRecursive(TreeNode root, int data) {
        if (root==null){
            return false;
        }

        if (root.data==data){
            return true;
        } else if (data<root.data) {
           return searchRecursive(root.left,data);
        }else {
           return searchRecursive(root.right,data);
        }

    }

}


public class Tree {

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        int[] arr={5,6,1,7 ,3 ,0,4};
        for (int i:arr){
            tree.add(i);
        }
        tree.inorder();
        tree.preOrder();
        tree.postOrder();
        System.out.println(tree.search(4));
    }
}
