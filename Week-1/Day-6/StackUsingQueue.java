import java.util.Stack;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;

public class Solution {

    public static class QueueTwoStacks {

        private Stack<Integer> inStack = new Stack<>();
        private Stack<Integer> outStack = new Stack<>();
        
        public void enqueue(int item)
        {
            inStack.push(item);
        }

        public int dequeue() 
        {
        if (outStack.isEmpty())
        {
            while (!inStack.isEmpty()) 
            {
               outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
        }
    }
    
