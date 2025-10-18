public class Validate_BST {

    public static boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

    public static boolean helper(TreeNode node,Integer low,Integer high){
        if(node == null) return true;

        if(low != null && node.val <= low) return false;
        if(high != null && node.val >= high) return false;

        boolean leftTree = helper(node.left,low,node.val);
        boolean rightTree = helper(node.right,node.val,high);

        return leftTree && rightTree;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        boolean ans = isValidBST(root);
        System.out.println(ans);
    }
}
