class Solution {
  public boolean flipEquiv(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null)
      return true;

    if (node1 == null || node2 == null || node1.val != node2.val)
      return false;
      return (flipEquiv(node1.left, node2.left) && flipEquiv(node1.right, node2.right)) ||
        (flipEquiv(node1.left, node2.right) && flipEquiv(node1.right, node2.left));
// there is two cases root is flipped and root is no tflipped jab root is not flipped to roo1.left == root2.left but when root is flipped root1.left == root2.right


    
  }
}