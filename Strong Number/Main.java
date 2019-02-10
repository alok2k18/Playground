import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp,i;
      int fact,rem,sum=0;
      temp=n;
      
      while(temp>0)
      {
        
        rem=temp%10;
        for(i=1,fact=1;i<=rem;i++)
        {
        fact=fact*i;
        }
        sum=sum+fact;
        temp=temp/10;
        
        // Type your code here
	}
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
}
  
}