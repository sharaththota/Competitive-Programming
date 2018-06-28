import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {
    static int x;

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

    public static int findSecondLargest(BinaryTreeNode rootNode) {

        
        if(rootNode == null || rootNode.right == null && rootNode.left == null){
            throw new IllegalArgumentException("null");
        }
        cou C = new cou(); 
        sLargest(rootNode, C);
        return x;
    }

    public static class cou {
        int c = 0;
    }
 
   public static void sLargest(BinaryTreeNode node, cou C)
    {  
        if (node == null || C.c >= 2)
            return;
             
        sLargest(node.right, C); 
        C.c++;
        if (C.c == 2)
        {
             x=node.value; 
        }
        sLargest(node.left, C); 
        
    }


