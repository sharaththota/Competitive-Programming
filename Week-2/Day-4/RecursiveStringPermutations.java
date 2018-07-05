import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

  public static Set<String> getPermutations(String inputString) {

    if (inputString.length() <= 1) {
        return new HashSet<>(Collections.singletonList(inputString));
    }

    String allExceptLast = inputString.substring(0, inputString.length() - 1);
    char lastCh = inputString.charAt(inputString.length() - 1);

    Set<String> permutationsOfAllCharsExceptLast = getPermutations(allExceptLast);

    Set<String> permutations = new HashSet<>();
    for (String permutationOfAllCharsExceptLast : permutationsOfAllCharsExceptLast) {
        for (int position = 0; position <= allExceptLast.length(); position++) {
            String permutation = permutationOfAllCharsExceptLast.substring(0, position) + lastCh
                + permutationOfAllCharsExceptLast.substring(position);
            permutations.add(permutation);
        }
    }

    return permutations;
}
