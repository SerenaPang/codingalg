package alg.tree;

public class HeightofBinaryTree {
    public int findHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max( findHeight(root.left),findHeight(root.right) + 1);
    }
}
