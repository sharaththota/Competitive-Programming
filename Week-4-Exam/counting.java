import java.util.Scanner;
class counting {
    
    public static String countBits(int num) {
        String s="[0";
        if (num < 0) {
            System.out.print(new int[0]);
        }
        
        int[] result = new int[num + 1];
        
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {
                result[i] = result[i / 2];
            } else {
                result[i] = result[i - 1] + 1;
            }
            s=s+","+result[i];
        }
        return s;
        
    }
    public static void main(String args[])
    {
        for(int i=0;i<6;i++)
        {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String res=countBits(n);
        res=res+"]";
        System.out.println(res);
        }
    }
}
