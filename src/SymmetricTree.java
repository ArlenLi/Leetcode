/**
 * Created by lld on 16/8/18.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirrorself(root.left, root.right);
    }
    public boolean isMirrorself(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null)||(p != null && q == null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isMirrorself(p.left, q.right)&&isMirrorself(p.right, q.left);
    }
}
