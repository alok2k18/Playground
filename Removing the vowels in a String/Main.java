import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
      if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||(s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
    {
        //System.out.print("");
    }
     else
     {
       System.out.print(s.charAt(i));
     }//type your code here
    }
 }
  
}