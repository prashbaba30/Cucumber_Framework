package Scanner_Demo;

import java.util.Scanner;

public class CONTINUE_JUMPING_DEMO {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// CONTINUE_JUMPING_DEMO using Scanner class
         
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		x=sc.nextInt();
		while(x<=152)
		{
			if(x==10)
			{
				x++;
				continue;
			}
			System.out.println(x);
			x++;
		}
	}

}
