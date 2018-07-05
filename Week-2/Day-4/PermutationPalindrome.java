import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;

import static org.junit.Assert.*;

public class Solution {
    
    static int CH = 256;

    public static boolean hasPalindromePermutation(String theString) {

        // check if any permutation of the input is a palindrome
        
    int count[] = new int[CH];
    Arrays.fill(count, 0);
    
    for (int i = 0; i < theString.length(); i++)
    {
    count[(int)(theString.charAt(i))]++;
    }
    int odd = 0;
    for (int i = 0; i < CH; i++) 
    {
    if ((count[i] & 1) == 1)
        odd++;
 
    if (odd > 1)
        return false;
    }
 return true;
}
