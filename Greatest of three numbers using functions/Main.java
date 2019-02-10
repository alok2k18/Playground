import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      System.out.println(getGreatest(n1,n2,n3));// Type your code here
	}
  public static int getGreatest(int n1,int n2,int n3)
  { int greatest=0;
  if((n1>n2) && (n2>n3))
  {
    greatest=n1;
  }
    
    
  if((n2>n3) && (n2>n1))
  {
    greatest=n2;
  }
    
    
  if((n3>n1) && (n3>n2))
  {
    greatest=n3;
  }
   
   return greatest;
}
  
}