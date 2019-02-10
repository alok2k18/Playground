import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int first=n;
      int last=n%10;
      while(first>=10)
      {
      first=first/10;
      }
      System.out.println(first+last);
      
      
      // Type your code here
	}
}