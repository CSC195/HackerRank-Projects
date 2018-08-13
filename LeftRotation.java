// A left rotation operation on an array shifts each of the array's elements  unit to the left. 
//For example, if 4 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [5, 1, 2, 3, 4].

import java.util.Scanner;

public class LeftRotation 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//declare array
		int[] array;  
		
		//to hold the number of rotations
		int leftRot;
		
		//to hold the size of the array the user inputs
		int arraySize;
		
		//to hold the value of each index in the array
		int arrayIndex;
		
		//create a scanner object
		Scanner scan = new Scanner(System.in);
		
		//ask the user to enter the number of rotations they would like to perform
		System.out.println("Enter number of rotations: ");
		leftRot = scan.nextInt();
		
		//ask the user for the size of the array
		System.out.println("Enter a size for the array: ");
		arraySize = scan.nextInt();
		
		//initialize the array with the size of the array the user inputs
		array = new int[arraySize];
		
		//loop through the array and ask the user to input the numbers they would like for each element
		for(int index = 0; index < arraySize; index++)
		{
			System.out.println("Enter a number for index " + (index + 1) + ": ");
			arrayIndex = scan.nextInt();
			array[index] = arrayIndex;
		}
		
		//while i is less than th value of leftRot, loop through each index of the array
		//and if the value is not the last index of the array, shift each index to the left
		//set the last index value to the first index value stores in firstIndex 
		for(int i = 0; i < leftRot; i++)
		{
			int firstIndex = array[0];
			for(int j = 0; j < array.length; j++)
			{
				if(array[j] != array[array.length-1])
				{
					array[j] = array[j + 1];
				}
				else
				{
					array[array.length-1] = firstIndex;
				}
			}
		}
		
		//print the contents of the array once i == leftRot
		for(int z = 0; z < array.length; z++)
		{
			System.out.print(array[z] + " ");
		}
	}

}
