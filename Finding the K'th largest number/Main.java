import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int k=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i]<a[j])
          {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
      }
      
      
      System.out.println(a[k-1]); 
     // Type your code here
    }   
}