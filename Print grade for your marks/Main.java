import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
      int marks=sc.nextInt();
      if(marks>=85)
        System.out.println("A");
      if(marks>=75 && marks<85)
      System.out.println("B");
	if(marks>=65 && marks<75)
      System.out.println("C");
      if(marks>55 && marks<65)
        System.out.println("D");
        if(marks>=45 && marks<55)
           System.out.println("E");
      if(marks<45)        
      System.out.println("Fail");
      
      // Type your code here
    }
}