import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      System.out.println(getPower(b,e));
      // Type your code here
	}
  
  public static int getPower(int b,int e)
  {
    int p=1;
      for(int i=1;i<=e;i++)
      {
      p=p*b;  
      }
      return p;
  }
  
}