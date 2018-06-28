public class Solution {

    public static boolean contains(int[] a, int n) {

         int len = a.length;
         int result = bsearch(a,0,len-1,n);
         if (result == -1)
         {
            return false;
         }
        else
        {
            return true;
        }
    }
   public static int bsearch(int a[], int low, int high, int num)
        {
        if (high>=low)
        {
            int mid = low + (high - low)/2;
 
            
            if (a[mid] == num)
               return mid;
 
            
            if (a[mid] > num)
               return bsearch(a, low, mid-1, num);
 
            return bsearch(a, mid+1, high, num);
        }
        return -1;
    }
