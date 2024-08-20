import java.util.Scanner;
public class IT24103629Lab4Q1
{
	public static void main(String[] args)
	{
		Scanner number = new Scanner(System.in);
		
		int num;
		
		
		System.out.print("Enter a number: ");
		num = number.nextInt();
		 
		if(num > 0)
		{
			System.out.print("The number is: positive");
		}
		else if (num < 0 )
		{
			System.out.print("The numbr is: negative");
		}
		else
		{
			System.out.print("The number is zero");
		}
	}
}

		
		
		