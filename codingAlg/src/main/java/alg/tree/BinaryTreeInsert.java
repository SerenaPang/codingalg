package alg.tree;

public class BinaryTreeInsert {
    public TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }
        if(key < root.value){
            root.left = insert(root.left, key);
        } else if(key > root.value){
            root.right = insert(root.right, key);
        }
        return root;
    }
}
