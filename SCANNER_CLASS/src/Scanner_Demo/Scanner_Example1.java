package Scanner_Demo;

import java.util.Scanner;

public class Scanner_Example1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
      int A,B,C;
		Scanner ok= new Scanner(System.in);		   
    System.out.println("Enter the value of A,B,C");
    
    A=ok.nextInt();
    B=ok.nextInt();
    C=ok.nextInt();
    
      System.out.println("A="+A);
      System.out.println("B="+B);
      System.out.println("C="+C);
      
      if (A<B && B<C)
      {
   	   System.out.println("A is the smallest number");       	  
      }
      else if (B<A && B<C)
      {
   	   System.out.println("B is the smallest number");
      }
      else
   	   System.out.println("C is the smallest number");
	}
	}