import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      
      System.out.println(getgcd(n1,n2,n3));
      
      // Type your code here
	}
  
  public static int getgcd(int num1,int num2,int num3)
  {
    int min=0,gcdtemp=0,gcd=0;
    
    if(num1<num2)
    {
      min=num1;
    }
    else
    {
      min=num2;
    }
    while(min>=1)
    {
    if((num1%min==0)&&(num2%min==0))
    {
      gcd=min;
      break;
    }
    min--;
    }
    gcdtemp=gcd;
    
    if(gcdtemp<num3)
    {
      min=gcdtemp;
    }
    else
    {
    min=num3;
    }
    while(min>=1)
    {
      if((gcdtemp%min==0) &&(num3%min)==0)
      {
        gcd=min;
        break;
      }
      min--;
      
    }
    return gcd;
  }
}