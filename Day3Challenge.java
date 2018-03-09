import java.util.Scanner;

/**
 * 
 */

/**
 * @author CSC195
 * Ask the user for an integer 'n' and perform the folling functions:
 * If n is odd, print "Weird"
 * If n is even and in the inclusive range of 2 to 5 , print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
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
