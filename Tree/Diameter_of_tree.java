public class Diameter_of_tree {
    static int dia=0;
    
    public static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return dia;
        
    }

    public static int helper(TreeNode root){
        if(root == null) return 0;

        if(root.left==null && root.right==null){
            return 1;
        }

        int leftheight = helper(root.left);
        int rightheight = helper(root.right);
        dia=Math.max(dia, leftheight+rightheight);

        return Math.max(leftheight,rightheight)+1;
        
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int ans = diameterOfBinaryTree(root);
        System.out.println(ans);
    }
}
