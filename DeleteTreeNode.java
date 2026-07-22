//450=Delete a Node from Binary Search Tree
public class DeleteTreeNode(TreeNode root,int key) {
    if (root==null){
        return  null;
    }
    if (key <root.val){
        root.left=DeleteTreeeNode(root.left,key);

    }
    if (key >root.val){
        root.right=DeleteTreeeNode(root.right,key);

    }
    else{
        if (root.left==null){
            return root.right;
        }
        if (root.right==null){
            return root.left;
        }
        
        TreeNode minNode=findMin(root.right);
        root.val=minNode.val;
        root.right=DeleteTreeeNode(root.right,minNode.val);
        }
        return root;
    }
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
