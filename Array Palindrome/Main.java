import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      int isequal=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int l=0;
      int r=n-1;
      while(l<r)
      { 
        isequal=0;
        if(a[l]!=a[r])
        {
          isequal=1;
          break;
        }
        l++;r--;
      }
        if(isequal==0)
          System.out.println("Yes");
        else
        System.out.println("No");
          
          // Type your code here
    }
}
  
