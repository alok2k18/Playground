import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=1;
      for(int row=1;row<=n;row++)
      {
        for(int space=1;space<=(n-row);space++)
        {
          System.out.print(" ");
          
        }
        for(int col=1;col<=row;col++)
        {
        System.out.print(num+" ");
          num++;
        }
        System.out.print("\n");
        // Type your code here
    }    
}
  
}