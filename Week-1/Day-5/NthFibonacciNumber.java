import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static int fib(int n) {

        // compute the nth Fibonacci number
        if(n<0)
        throw new IllegalArgumentException("Negative number");
         
        else if(n==0 || n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);

    
    }



