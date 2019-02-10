import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      System.out.println(getsum(n));    // Type your code here
	}
  public static int getsum(int num)
  { 
    int sum=1;
    int s=0;
    for(int i=1;i<=num;i++)
    {
      s=s+sum++;
    }
   return s;
  }
}