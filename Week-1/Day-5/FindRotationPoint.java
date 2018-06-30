import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static int findRotationPoint(String[] words) 
    {
       int len=words.length;
       int first=0;
       int last=len-1;
       int mid=first+(last-first)/2;
       return b_search(words,first,last,mid);
    }
public static int b_search(String [] words, int first, int last, int mid){
        if (first>=last)
            return mid;
        if (words[mid].compareTo(words[last]) > 0){
            first=mid+1;
            mid=first+(last-first)/2;
            return b_search(words, first, last, mid);
        }
        if (words[mid].compareTo(words[first]) < 0){
            last=mid;
            mid=first+(last-first)/2;
            return b_search(words, first, last, mid);
        }
        throw new IllegalArgumentException();
            
    }
