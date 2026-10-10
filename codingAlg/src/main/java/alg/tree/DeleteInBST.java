package alg.tree;

public class DeleteInBST {
    public TreeNode delete(TreeNode root, int key){
        if(root == null){
            return null;
        }
        if(key == root.value){
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else if (root.right.left == null){
                return root.right;
            }else{
                TreeNode newRoot = deleteSmallest(root.right);
                newRoot.right = root.right;
                return root.right;
            }

        } else if(key > root.value){
            delete(root.right, key);
        } else if(key < root.value){
            delete(root.left, key);
        }
        return root;
    }

    private TreeNode deleteSmallest(TreeNode root){
        while(root.left.left != null){
            root = root.left;
        }
        TreeNode smallest = root.left;
        root.left = root.left.right;
        return smallest;
    }
    
}
