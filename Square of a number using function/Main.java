import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum(n));
	 // Type your code here   
	}
  public static int sum(int num)
  {
    return num*num;
  }
}