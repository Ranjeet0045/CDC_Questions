package Priority_Queue;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Is_Binary_tree_heap {

    static boolean helper(TreeNode root){
        if(root == null) return true;

        if(root.left == null && root.right != null){
            return false;
        }
        if((root.left != null && root.val <= root.left.val) || (root.right != null && root.val <= root.right.val)){
            return false;
        }
        return helper(root.left) && helper(root.right);
    }                                                      

    static boolean isHeap(TreeNode root) {

        boolean heapProp = helper(root);

        if (root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean seenNull = false;

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (cur == null) {
                seenNull = true;
            } else {
                if (seenNull) {
                    return false;
                }
                q.add(cur.left);
                q.add(cur.right);
            }
        }

        return heapProp;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(97);
        root.left = new TreeNode(46);
        root.right = new TreeNode(37);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(31);
        root.left.left.left = new TreeNode(6);
        root.left.left.right = new TreeNode(9);

        boolean ans = isHeap(root);
        System.out.println(ans);
    }
}
