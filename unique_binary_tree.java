/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
  public List<TreeNode> generateTrees(int n) {
        def genrateTrees(self ,n:int)->List[Optional[TreeNode]]:
          def helper(first,last):
            trees=[]
            for root in range(first,last+1):
               for left in helper(first,root-1):
                   for right in helper(root+1,last):
                       node=TreeNode(root)
                       node.left=left
                       node.right=right
                       trees.append(node)
        
 */
class Solution {
    public List<TreeNode>generateTrees(int n){
         return helper(1,n);
    }
    private List<TreeNode>helper(int first,int last){
        List<TreeNode>trees=new ArrayList<>();
        if (first>last){
            trees.add(null);
            return trees;
        }
        for (int root =first;root<=last;root++){
            List<TreeNode>leftTrees=helper(first,root-1);
            List<TreeNode>RightTrees=helper(root+1,last);
            for (TreeNode left:leftTrees){
                for (TreeNode right:RightTrees){
                    TreeNode node=new TreeNode(root);
                    node.left=left;
                    node.right=right;
                    trees.add(node);

                }
            }
        }
        return trees;
    }}