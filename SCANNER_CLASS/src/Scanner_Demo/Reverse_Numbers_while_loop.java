package Scanner_Demo;

import java.util.Scanner;

public class Reverse_Numbers_while_loop {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Reverse the Number by using while loop in scanner class
		
		int x, reverse=0;
		System.out.println("Enter the numbers =");
		
		Scanner sc= new Scanner(System.in);
		x= sc.nextInt();
		/* reverse = sc.nextInt();
		reminder = sc.nextInt();*/
		
		while(x>0) 
		{
			int reminder=x%10;
			reverse=reverse*10+reminder;
					x=x/10;
		}
     System.out.println("Reverse number is =" +reverse);
	}

}
