public class ProductOfThreeElements {
 
 public static void main(String[] args) 
 {
int a[] = new int[]{-5, -1, -3, -2}; 
System.out.println(Product(a));
 }
 
 public static Integer Product(int a[]) 
 {
  if((a==null)||(a.length<3))
  {
   return null;
  }
  
  else
  {
   int max[] =Max(a);
   int max1 = max[0];
   int max2 = max[1];
   int max3 = max[2];

   int min[] = Min(a);
   int min1 = min[0];
   int min2 = min[1];
  
return (max1*max2*max3)>(max1*min1*min2)?(max1*max2*max3):(max1*min1*min2);
  }
 }
 public static int[] Max(int a[])
 {
  int max1, max2,max3;
  max1=max2=max3= a[0];
  
  for(int i=1;i<a.length;i++)
  {
   if(a[i]>=max1)
   {
    max3 = max2;
    max2 = max1;
    max1 = a[i];
  
   }
   else if((a[i]>=max2)&&(a[i]<max1))
   {
    max3 = max2;
    max2 = a[i];
   }
   
   else if((a[i]>=max3)&&(a[i]<max2))
   {
    max3 = a[i];
   }
  }
  
  return new int[]{max1,max2,max3};
 }
 
 
 public static int[] Min(int a[])
 {
  int min1, min2;
  min1=a[0];
  min2=a[1];
  
  for(int i=1;i<a.length;i++)
  {
   if(a[i]<=min1)
   {
    min2 = min1;
    min1 = a[i];
  
   }
   else if((a[i]<=min2)&&(a[i]>min1))
   {
    min2 = a[i];
   }
   
  }
   return new int[]{min1,min2};
  
 }
}
