package Scanner_Demo;

import java.util.Scanner;

public class Armstrong_number_demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Armstrong Number verify by using scanner class
		
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
                  x= sc.nextInt();
      int remainder, cube, cubesum=0, temp;
      temp=x;
      while(x>0)
      {
    	  remainder= x%10;
    	  cube=remainder*remainder*remainder;
    	  cubesum=cubesum+cube;
    	  x=x/10;
      }
      if(temp==cubesum)
      {
    	  System.out.println("The Number is Armstrong = "+cubesum);
      }
      else
      {
    	  System.out.println("The Number is not Armstrong = "+cubesum);
      }
	}

}
