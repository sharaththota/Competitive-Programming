public class Solution {

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }

    public static boolean isBalanced(BinaryTreeNode treeRoot) {

        int lh; 
        int rh; 
        
        if (treeRoot == null)
            return true;
        
        lh = height(treeRoot.left);
        rh = height(treeRoot.right);
  
        if (Math.abs(lh - rh) <= 1
                && isBalanced(treeRoot.left)
                && isBalanced(treeRoot.right)) 
            return true;
            
        return false;
    }


static int height(BinaryTreeNode node) 
    {
       if (node == null)
            return 0;
    
        return 1 + Math.max(height(node.left), height(node.right));
    }

 public static void main(String[] args) {

     final BinaryTreeNode root = new BinaryTreeNode(3);
        root.insertLeft(4).insertLeft(1);
        root.insertRight(2).insertRight(9);
        final boolean result = isBalanced(root);
        System.out.println(result);
}
}
