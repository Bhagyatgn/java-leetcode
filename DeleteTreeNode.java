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
        else if (root.right==null){
            return root.left;
        }
        else{
            TreeNode minNode=findMin(root.right);
            root.val=minNode.val;
            root.right=DeleteTreeeNode(root.right,minNode.val);
        }
    }

}
