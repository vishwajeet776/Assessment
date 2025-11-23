package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    private TreeNode addRecursive(TreeNode root,int data){
        if (root==null){
            return new TreeNode(data);
        }
        if (data < root.data){
            root.left=addRecursive(root.left, data);
        }else {
            root.right=addRecursive(root.right, data);
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

    public boolean search(int target){
        return searchRecursive(root,target);
    }

    private boolean searchRecursive(TreeNode root,int target){
        if (root==null){
            return false;
        }
        if (root.data==target){
            return true;
        } else if (target< root.data) {
            return searchRecursive(root.left, target);
        }else {
            return searchRecursive(root.right, target);
        }
    }

    public int height(){
        return heightRecursive(root);
    }

    public int longestPath(){
        return heightRecursive(root);
    }
    private int heightRecursive(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftheight=heightRecursive(root.left);
        int rightHeight=heightRecursive(root.right);
        return Math.max(leftheight,rightHeight)+1;
    }

   public int depth(int target){
        return depthRecursive(root,target);
   }
   private int depthRecursive(TreeNode root,int target){
        if (root==null){
            return -1;
        }
        if (root.data==target){
            return 0;
        }
        int left=depthRecursive(root.left, target);
        int right=depthRecursive(root.right, target);
        if (left!=-1){
            return left+1;
        }
        if (right!=-1){
            return right+1;
        }
        return -1;
   }

    public void invertTree(){
        invertTreeRecursive(root);
        System.out.println();
    }

    private void invertTreeRecursive(TreeNode root) {
        if (root==null){
            return ;
        }

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTreeRecursive(root.left);
        invertTreeRecursive(root.right);

    }
    public void levelOrder(){
        levelOrderRecursive(root);
        System.out.println();
    }

    private void levelOrderRecursive(TreeNode root) {
        if (root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            System.out.print(temp.data+" ");
            if (temp.left!=null){
                q.add(temp.left);
            }
            if (temp.right!=null){
                q.add(temp.right);
            }
        }
    }

    public void leftView(){
        leftViewRecursive(root);
        System.out.println();
    }

    private void leftViewRecursive(TreeNode root) {
        if (root==null){
            return;
        }
        System.out.print(root.data);
        leftViewRecursive(root.left);
    }

    public TreeNode deleteNode(int data){
        return deleteNodeRecursive(root,data);
    }

    private TreeNode deleteNodeRecursive(TreeNode root, int data) {
        if (root==null){
            return null;
        } else if (data<root.data) {
            root.left=deleteNodeRecursive(root.left, data);
        }else if (data> root.data){
            root.right=deleteNodeRecursive(root.right, data);
        }
        else {
            if (root.left==null && root.right==null){
                return null;
            } else if (root.left==null) {
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }else {
                TreeNode IS=inorderSuccessor(root.right);
                root.data= IS.data;
                root.right=deleteNodeRecursive(root.right, IS.data);
            }
        }


        return root;
    }

    private TreeNode inorderSuccessor(TreeNode root) {
        while (root.left!=null){
           root=root.left;
        }
        return root;
    }

    public List<String> printAllPath(){
        List<String> path=new ArrayList<>();
        printAllPathRecursive(root,path,"");
        return path;
    }

    private void printAllPathRecursive(TreeNode root, List<String> path,String currPath) {
        if (root==null){
            return;
        }
        currPath+=root.data;
        if (root.left==null && root.right==null){
            path.add(currPath);
        }else {
            currPath+="->";
            printAllPathRecursive(root.left, path,currPath);
            printAllPathRecursive(root.right, path,currPath);
        }

    }

}


public class Tree {

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        int[] arr={4,2,7,1,3,6,9};
        for (int i:arr){
            tree.add(i);
        }
        tree.inorder();
        tree.preOrder();
        tree.postOrder();
        System.out.println(tree.search(4));
        System.out.println(tree.height());
        System.out.println(tree.longestPath());
        System.out.println(tree.depth(9));

        System.out.println("///////////////////////////");
//        tree.invertTree();

        System.out.println("print tree in level order");
        tree.levelOrder();

        System.out.println("print left view of tree");
        tree.leftView();

        System.out.println("delet node");
        tree.deleteNode(4);

        System.out.println("Re-Print the tree");
        tree.preOrder();

        System.out.println("print all path");
        System.out.println(tree.printAllPath());
    }
}
