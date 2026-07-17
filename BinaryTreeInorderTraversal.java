import java.util.*;

public class BinaryTreeInorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // LeetCode solution
    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }

    public static void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, result);

        // Root
        result.add(root.val);

        // Right
        inorder(root.right, result);
    }

    // Main method for testing
    public static void main(String[] args) {

     

        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);

        root.right.left = new TreeNode(3);

        List<Integer> result = inorderTraversal(root);

        System.out.println(result);
    }
}
