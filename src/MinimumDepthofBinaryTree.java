import apple.laf.JRSUIUtils;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by lld on 16/8/21.
 */
public class MinimumDepthofBinaryTree {
    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftMin = root.left==null?(Integer.MAX_VALUE):(minDepth(root.left));
        int rightMin = root.right==null?(Integer.MAX_VALUE):(minDepth(root.right));
        return leftMin < rightMin?(leftMin + 1):(rightMin + 1);
    }

    public static int minDepth2(TreeNode root) {
        if (root == null)
            return 0;
        int leftMin = minDepth2(root.left);
        int rightMin = minDepth2(root.right);
        if (leftMin == 0 && rightMin == 0)
            return 1;
        if (leftMin == 0)
            return rightMin + 1;
        if (rightMin == 0)
            return leftMin + 1;
        return leftMin < rightMin?(leftMin + 1):(rightMin + 1);
    }

    // use iteration
    public static int minDepth3(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        int count = 1;
        while(queue.peek()!=null) {
            Queue<TreeNode> tempQueue = new LinkedBlockingQueue<>();
            while(queue.peek()!=null) {
                TreeNode temp = queue.poll();
                if (temp.left == null && temp.right == null) {
                    return count;
                }
                if (temp.left != null)
                    tempQueue.add(temp.left);
                if (temp.right != null)
                    tempQueue.add(temp.right);
            }
            count++;
            queue = tempQueue;
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode num2 = new TreeNode(3);
        TreeNode num3 = new TreeNode(4);
        root.left = num2;
        num2.right = num3;
        System.out.println(minDepth3(root));
    }
}
