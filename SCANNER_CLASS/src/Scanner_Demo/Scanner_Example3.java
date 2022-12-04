package Scanner_Demo;


import java.util.Scanner;
 public class Scanner_Example3 {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			int A;
			int B;
			int C;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number=");
			A= sc.nextInt();
			System.out.println("Enter the number=");
			B= sc.nextInt();
			C=A+B;
			C= A*B;
			System.out.println("Addition is= "+ C);
			System.out.println("Multipication is = " +C);
		}

	}