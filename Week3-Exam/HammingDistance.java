import java.io.*;
import java.util.*;
import java.lang.*;
public class HammingDistance {
	
	public static int Hammingdistance(int a,int b)
	{
		int k=0,sum=0,rnb;
		k=a^b;
		rnb=numberofbits(k);
		int[] arr = new int[k];
		for (int j = rnb - 1; j >= 0; j--) 
		 {
		   arr[j] = k % 2;
		   k = k / 2;
		  }
		for (int r = 0; r < rnb; r++) 
		  {

		   if (arr[r] == 1)
		    sum++;

		  }
		  return sum;		
	}
	public static int numberofbits(int z)
	{
		  int i = 0;
		  while ((2 << i) <= z)
		   i++;
		  i++;
		  return i;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("no of test cases=");
		int n=s.nextInt();
		for(int i=1;i<n+1;i++)
		{
		System.out.println("Test Case"+i);
		System.out.print("x=");
		int x=s.nextInt();
		System.out.print("y=");
		int y=s.nextInt();
		System.out.println("output="+Hammingdistance(x,y));
		}
		
	}
}
