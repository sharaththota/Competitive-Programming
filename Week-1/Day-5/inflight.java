import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;

import static org.junit.Assert.*;

public class Solution {

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        // determine if two movies add up to the flight length
        Set<Integer> h=new HashSet<>();

    for(int i : movieLengths) {

        int b=flightLength-i;
        if (h.contains(b)) {
            return true;
        }

        h.add(i);

        
    }
    return false;
}
