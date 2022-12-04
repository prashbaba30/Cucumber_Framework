package sanii;

public class Demo_30 {

	public static void main(String[] args) {
		
		char ch = 'A';
		int i, j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				System.out.print(ch+" ");
				if(ch<'Z')
				{
					ch++;
				}
				else
				{
					ch= (char)'A';
				}
			}
				System.out.println();
			}
		}
		

	}

