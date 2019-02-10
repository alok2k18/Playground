import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int pattern=n;
      int col;
      for(int row=1;row<=n;row++)
      {
       for(col=(n-row+1);col>=1;col--)
       {
         System.out.print(col);
         
       }
        
        System.out.print("\n");
      }// Type your code here
	}
}