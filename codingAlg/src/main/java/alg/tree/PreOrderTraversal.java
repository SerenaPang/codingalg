package alg.tree;
import java.util.ArrayList;
import java.util.List;


public class PreOrderTraversal {
    public List<Integer> preOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.value);
        helper(root.left, res);
        helper(root.right, res);
    }
}
