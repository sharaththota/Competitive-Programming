import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;
import static org.junit.Assert.*;

public class Solution {

    public static void reverseWords(char[] message) {

        reverse(0, message.length-1, message);
        boolean oneWord = true;
        int left = 0;
        for (int i = 0 ; i < message.length ; i++){
            if (message[i] == ' '){
                oneWord = false;
                reverse(left, i-1, message);
                left = i+1;
            }
        
        }
        if (oneWord){
            reverse(0, message.length-1, message);
            return;
        }
        if (left < message.length-1)
            reverse(left, message.length-1, message);

    }
    
    public static void reverse(int left, int right, char [] message){
        while(left < right){
            char temp = message[left];
            message[left] = message[right];
            message[right] = temp;
            left++;
            right--;
        }
    }
