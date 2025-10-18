import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_tree_right_side_view {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currlevel = new ArrayList<>(levelsize);

            for(int i=0; i<levelsize; i++){
                TreeNode currNode = queue.remove();
                currlevel.add(currNode.val);
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
            int n = currlevel.size();
            result.add(currlevel.get(n-1));
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> ans = rightSideView(root);
        System.out.println(ans);
    }
}
