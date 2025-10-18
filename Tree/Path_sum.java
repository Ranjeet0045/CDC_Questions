public class Path_sum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        boolean ans = helper(root,targetSum,0);
        return ans;

    }
    public static boolean helper(TreeNode root,int targetSum,int sum){
        if(root == null){
            return false;
        }

        sum += root.val;


        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }
        return helper(root.left,targetSum,sum) || helper(root.right,targetSum,sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        boolean ans = hasPathSum(root,targetSum);
        System.out.println(ans);
    }
}
