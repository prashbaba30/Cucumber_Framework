package Scanner_Demo;

import java.util.Scanner;

public class If_else_ladder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// using logical number divisible by given number
		
				int A;
				Scanner sc = new Scanner(System.in);
				A= sc.nextInt();
				System.out.println("Enter the Value of A="+A);
				
				if(A%5==0 && A%6==0)
				{
					System.out.println("Number is divisible by 5 and 6");
				}
				else
				{
					System.out.println("Number is not divisible by both 5 and 6");
				}
	}

}
