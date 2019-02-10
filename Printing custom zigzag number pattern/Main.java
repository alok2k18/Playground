import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int row=1;row<=n;row++)
      {
        if(row%2==1)
        {  for(int col=1;col<=(n-1);col++)
          {System.out.print(row);
          }
         System.out.print(row+1);
         System.out.print("\n");
        }
        else
        {
          System.out.print(row+1);
          for(int col=1;col<=(n-1);col++)
          {
            System.out.print(row);
          }
          System.out.print("\n");
        
        }
        
      }// Type your code here
	}
}