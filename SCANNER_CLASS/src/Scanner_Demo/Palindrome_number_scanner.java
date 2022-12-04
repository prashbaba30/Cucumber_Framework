package Scanner_Demo;

import java.util.Scanner;

public class Palindrome_number_scanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		x = sc.nextInt();
          int reverse=0, remainder, temp;
                temp=x;
            while (x>0)
            {
            	remainder= x%10;
            	reverse= reverse*10+remainder;
            	x=x/10;
            }
            if(temp==reverse)
            {
            	System.out.println("The number is Palindrome = " +reverse);
            }
            else
            {
            	System.out.println("The number is not Palindrome =" +reverse);
            }
	} 
}

