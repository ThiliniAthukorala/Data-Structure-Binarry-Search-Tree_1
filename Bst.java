public class Bst {
    TreeNode root;

    public TreeNode insertTreeNode(TreeNode root,TreeNode newNode){
        if(root==null){
            root=newNode;
            return root;
        }
        if (newNode.key<root.key){
            root.left=insertTreeNode(root.left,newNode);
        } else if (newNode.key>root.key) {
            root.right=insertTreeNode(root.right,newNode);
        }
        return root;
    }

    public void insert(int key){
        TreeNode newNode=new TreeNode(key);
        root=insertTreeNode(root,newNode);
    }

    public void inorderTraversal(TreeNode root){
        if (root!=null){
            inorderTraversal(root.left);
            System.out.println(root.key);
            inorderTraversal(root.left);
        }
    }

    public void inorder(){
        inorderTraversal(root);
    }

    public void preorderTraversal(TreeNode root){
        if (root!=null){
            System.out.println(root.key);
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }
    }
    public void preorder(){
        preorderTraversal(root);
    }

    public void postorderTraversal(TreeNode root){
        if (root!=null){
            inorderTraversal(root.left);
            inorderTraversal(root.right);
            System.out.println(root.key);
        }
    }
    public void postorder(){
        postorderTraversal(root);
    }
}
