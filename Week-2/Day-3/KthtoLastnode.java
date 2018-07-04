import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static LinkedListNode kthToLastNode(int k, LinkedListNode head) {

        // return the kth to last node in the linked list
        int len = 0;
        LinkedListNode temp = head;
       
        while (temp != null)
        {
            temp = temp.next;
            len++;
        }
 
        if (len < k || k==0)
            throw new IllegalArgumentException("null");
 
        temp = head;
 
        for (int i = 1; i < len-k+1; i++)
            temp = temp.next;
        
        return temp;
    }


