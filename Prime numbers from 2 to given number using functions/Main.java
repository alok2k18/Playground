import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      getPrime(n);// Type your code here
    }
    static void getPrime(int num)
    {
        int f=0,rem,n;
        for(int i=2;i<num;i++)
        {
            n=i;f=0;
            for(int j=1;j<n;j++)
            {
                rem=n%j;
                if(rem==0)
                f=f+1;
            }
            if(f==1)
            System.out.println(n);
        }
    }
}
