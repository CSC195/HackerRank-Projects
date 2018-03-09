import java.util.Scanner;

/**
 * 
 */

/**
 * @author gracecline
 *
 */
public class Solution 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		if(num % 2 == 0)
		{
			if(num >= 2 && num <= 5)
			{
				System.out.println("Not Weird");
			}
			else if(num >= 6 && num <= 20)
			{
				System.out.println("Weird");
			}
			else if(num > 20)
			{
				System.out.println("Not Weird");
			}
			else
			{
				System.out.println("I don't recognize that number");
			}
		}
		else
		{
			System.out.println("Weird");
		}

	}

}
