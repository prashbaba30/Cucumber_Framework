package Scanner_Demo;

import java.util.Scanner;

public class Switch_Arithmatic_logic {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
				
				// Using Switch statement - Execute one statement from multiple conditions
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the Values of A & B");
		     int A, B ;
		     A = sc.nextInt();
		     B = sc.nextInt();
		 
		    
		     // To determine Arithmatic operators
		     switch(B)
		     {
		     case 1 :
		    	 System.out.println("Addition = "+(A+B));
		    	 break;
		    	 
		     case 2 :
		    	 System.out.println("Substraction = "+(A-B));
		    	 break;
		    	 
		     case 3 :
		    	 System.out.println("Multipication = "+(A*B));
		    	 break;
		    	 
		     case 4 :
		    	 System.out.println("Division = "+(A/B));
		    	 break;
		    	 
		     case 5 :
		    	 System.out.println("Modulus = "+(A%B));
		    	 break;
		    	 
		    	 default:
		    	 System.out.println("Invalid Input");
			}
			}
		}
