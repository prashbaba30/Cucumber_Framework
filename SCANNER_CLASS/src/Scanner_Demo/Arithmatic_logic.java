package Scanner_Demo;

import java.util.Scanner;

public class Arithmatic_logic {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			// Using Arithmetic operators
			
			Scanner obj = new Scanner(System.in);
	        System.out.println("Enter the value of A & B");
	        int A, B;
	        A = obj.nextInt();
	        B = obj.nextInt();
	        
	        System.out.println("Addition ="+ (A+B));
	        System.out.println("Substraction ="+ (A-B));
	        System.out.println("Multipication ="+ (A*B));
	        System.out.println("Division ="+ (A/B));
	        System.out.println("Modulus ="+ (A%B));
		}

	}