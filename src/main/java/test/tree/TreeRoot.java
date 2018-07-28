package test.tree;

/**
 * Created by lijia on 2018/7/26.
 */
public class TreeRoot {
    private TreeNode treeRoot;

     TreeRoot(TreeNode treeRoot) {
        this.treeRoot = treeRoot;
    }
     TreeRoot() {
    }

    public TreeNode getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeNode treeRoot) {
        this.treeRoot = treeRoot;
    }

}
