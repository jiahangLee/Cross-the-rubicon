package test.tree;

/**
 * Created by lijia on 2018/7/26.
 */
public class Test {

    public static void main(String[] args){
        int[] arr = {2,5,3,9,1,0,1};
        TreeRoot tr = new TreeRoot();
        for(int i:arr){
            createNode(tr,i);
        }
        pre(tr);
        System.out.println("\n"+deep(tr));
    }
    public static int deep(TreeRoot treeRoot){
        if(treeRoot.getTreeRoot()  == null)
            return -1;
        int left = deep(new TreeRoot(treeRoot.getTreeRoot().getLeftNode()));
        int right = deep(new TreeRoot(treeRoot.getTreeRoot().getRightNode()));
        return Math.max(left,right)+1;
    }
    public static void pre(TreeRoot t){
        if(t.getTreeRoot() != null){

            pre(new TreeRoot(t.getTreeRoot().getLeftNode()));
            System.out.println(t.getTreeRoot().getV());
            pre(new TreeRoot(t.getTreeRoot().getRightNode()));
        }
    }
    public static void createNode(TreeRoot t,int v){

        if(t.getTreeRoot() == null){
            TreeNode treeNode = new TreeNode(v);
            t.setTreeRoot(treeNode);
        }else{
            TreeNode treeNode = t.getTreeRoot();
            if(treeNode != null){
                if(v>treeNode.getV()){
                    if(treeNode.getRightNode() == null){
                        TreeNode tree = new TreeNode(v);
                        treeNode.setRightNode(tree);
                        return;
                    }else{
                        treeNode = treeNode.getRightNode();
                        createNode(new TreeRoot(treeNode),v);
                    }
                }else{
                    if(treeNode.getLeftNode() == null){
                        TreeNode tree = new TreeNode(v);
                        treeNode.setLeftNode(tree);
                        return;
                    }else{
                        treeNode = treeNode.getLeftNode();
                        createNode(new TreeRoot(treeNode),v);
                    }
                }
            }
        }

    }
}
