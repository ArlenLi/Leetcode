import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by lld on 16/8/19.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedBlockingDeque<>();
        queue.add(root);
        int inCount = 1;
        int outCount = 0;
        while(queue.peek() != null) {
            root = queue.poll();
            outCount++;
            temp.add(root.val);
            if (root.left!=null)
                queue.add(root.left);
            if (root.right!=null)
                queue.add(root.right);
            if (outCount == inCount) {
                outCount = 0;
                inCount = queue.size();
                result.add(temp);
                temp = new ArrayList<>();
            }
        }
        Collections.reverse(result);
        return result;
    }
}
