package alg.recursion;

public class NumNodesLeft {
    static class TreeNodeLeft{
        int key;
        TreeNodeLeft left;
        TreeNodeLeft right;
        //total number of left nodes
        int numNodesLeft;

        public TreeNodeLeft(int key){
            this.key = key;
        }
    }

    private int numNodes(TreeNodeLeft root){
        if(root == null){
            return 0;
        }
        int leftNum = numNodes(root.left);
        int rightNum = numNodes(root.right);
        root.numNodesLeft = leftNum;
        //total number of nodes in the root's left subtree
        return leftNum + rightNum + 1;
    }
}
