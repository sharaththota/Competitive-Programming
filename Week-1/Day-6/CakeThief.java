import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static class CakeType {

        final int weight;
        final int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value  = value;
        }
    }

   public static int maxDuffelBagValue(final CakeType[] cakes, final int capacity) {
    final int[] maxValueAtCapacity = new int[capacity + 1];
    
    for (int i = 0; i <= capacity; i++) {
      int currentMaxValue = 0;

      for (int j = 0; j < cakes.length; j++) {
        final CakeType cake = cakes[j];
        if (cake.weight == 0 && cakes.length==1){
            throw new IllegalArgumentException("hi");
        }
        if (cake.weight <= i) {
          
          int maxValueUsingCake = cake.value + maxValueAtCapacity[i - cake.weight];
          currentMaxValue = Math.max(maxValueUsingCake, currentMaxValue);
        
        }
      }
      maxValueAtCapacity[i] = currentMaxValue;
   
    }
    return maxValueAtCapacity[capacity];
  }

