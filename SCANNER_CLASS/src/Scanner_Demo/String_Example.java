package Scanner_Demo;

import java.util.Scanner;

public class String_Example {
                            @SuppressWarnings("resource")
	public static void main(String[] args) {
		// Using all the keywords
		
		Scanner PK = new Scanner(System.in);
		System.out.println("Employee Name, Employee Id, Employee salary");
		
		// String input
                   String name = PK.nextLine();
                  
      // Numerical input       
                   int ID = PK.nextInt();
                   double Salary = PK.nextDouble();
                   
       // Output & input from the user
                   
              System.out.println("Employee Name ="+ name);
              System.out.println("Employee Id ="+ID);
              System.out.println("Employee Salary ="+Salary);
		}

}