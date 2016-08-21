import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lld on 16/8/21.
 */
public class PathSum {
//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null)
//            return false;
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        List<Integer> list = new ArrayList<>();
//        int currentSum = 0;
//        while(stack.empty() == false) {
//            TreeNode temp = stack.pop();
//            list.add(temp.val);
//            currentSum += list.indexOf(list.size()-1);
//            if (temp.left == null && temp.right == null) {
//                if (currentSum == sum)
//                    return true;
//                else{
//                    continue;
//                }
//
//            }
//            if (temp.left != null)
//                stack.push(temp.left);
//            if (temp.right != null)
//                stack.push(temp.right);
//        }
//    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        sum=sum-root.val;
        if (root.left == null && root.right ==null)
            return sum==0;
        else
            return hasPathSum(root.left, sum)||hasPathSum(root.right,sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-2);
        TreeNode num2 = new TreeNode(-3);
        TreeNode num3 = new TreeNode(4);
        root.left = null;
        root.right = num2;
        System.out.println(hasPathSum(root,-2));
    }
}
