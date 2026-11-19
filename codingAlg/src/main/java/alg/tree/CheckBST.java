package alg.tree;

public class CheckBST {
    public boolean isBST(TreeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.value <= min || root.value >= max){
            return false;
        }
        return isBST(root.left, min, root.value) && isBST(root.right, root.value, max);
    }
}
