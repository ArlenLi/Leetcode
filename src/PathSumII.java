import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lld on 16/8/21.
 */

/*
* Tips: When you want to add an object a to two another objects and during this process, you will change the value of a,
* you must create a temp object of a to complete this process.
*
* */
public class PathSumII {
    public static List<List<Integer>> pathSumII(TreeNode root, int sum) {

        List<TreeNode> treeNodeList = new ArrayList<>();
        List<List<Integer>> valueList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(root == null) {
            return result;
        }
        temp.add(root.val);
        treeNodeList.add(root);
        valueList.add(temp);

        while(treeNodeList.isEmpty()==false) {
            root = treeNodeList.remove(0);
            temp = valueList.remove(0);

            if (root.left == null && root.right == null) {
                int tempSum = 0;
                for (int i:temp) {
                    tempSum += i;
                }
                if (tempSum == sum) {
                    result.add(temp);
                }
            }
            if (root.left != null) {
                ArrayList<Integer> cloneList = new ArrayList<>();
                cloneList.addAll(temp);
                treeNodeList.add(root.left);
                cloneList.add(root.left.val);
                valueList.add(cloneList);
            }
            if (root.right != null) {
                treeNodeList.add(root.right);
                temp.add(root.right.val);
                valueList.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode num1 =new TreeNode(4);
        TreeNode num2 =new TreeNode(8);
        root.left = num1;
        root.right = num2;
        TreeNode num3 =new TreeNode(11);
        num1.left = num3;
        num1.right = null;
        TreeNode num4 =new TreeNode(13);
        TreeNode num5 =new TreeNode(4);
        num2.left = num4;
        num2.right = num5;
        TreeNode num6 =new TreeNode(7);
        TreeNode num7 =new TreeNode(2);
        num3.left = num6;
        num3.right = num7;
        TreeNode num8 =new TreeNode(5);
        TreeNode num9 =new TreeNode(1);
        num5.left = num8;
        num5.right = num9;
        System.out.println(pathSumII(root, 22));

    }
}
