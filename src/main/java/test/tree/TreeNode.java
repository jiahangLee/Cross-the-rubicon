package test.tree;

/**
 * Created by lijia on 2018/7/26.
 */
public class TreeNode {
    TreeNode(int value){
        this.v = value;
    }
    private TreeNode leftNode;
    private TreeNode rightNode;
    private int v;

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
