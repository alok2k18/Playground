import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
    
      int fact,i,s=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(i=1,fact=1;i<=n;i++)
      {
        
        fact=fact*i;
        
      }
      System.out.println(fact);
      // Type your code here
	}
}