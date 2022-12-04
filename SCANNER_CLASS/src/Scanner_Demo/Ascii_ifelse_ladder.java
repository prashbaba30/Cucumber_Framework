package Scanner_Demo;

import java.util.Scanner;

public class Ascii_ifelse_ladder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Program using ascii value
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		int a;
		a= sc.nextInt();
		if(a>=48 && a<=57)      // Ascii value of 0-9 is 48-57
		{
			System.out.println("That is the numerical");
		}
		else if(a>=65 && a<=90)   // Ascii value of Capital A to Z is 65 & 97
		{
			System.out.println("That is the Capital letter");
		}
		else if(a>=97 && a<=122) // Ascii value of small letter a to z is 97 & 122
		{
			System.out.println("That is the small letter");
		}
		else
		{
			System.out.println(" That is the invalid ");
		}
	}

}
