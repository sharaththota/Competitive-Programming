import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
import java.util.*;

public class Solution {

    public static class MaxStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxesStack = new Stack<>();
    
    public void push(int item) {
        stack.push(item);
        if (maxesStack.empty() || item >= maxesStack.peek()) {
            maxesStack.push(item);
        }
    }
    
    public int pop() {
        int item = stack.pop();
        if (item == maxesStack.peek()) {
            maxesStack.pop();
        }
        return item;
    }
    public int getMax() {
        return maxesStack.peek();
    }
}
