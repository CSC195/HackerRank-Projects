import java.util.*;
import java.io.*;

class Exercises
{
    public static void main(String []argh)
    {
    		int square = 0;
    	
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number of queries: ");
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
        		System.out.println("enter the values in the query on the same line seperated by spaces: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            System.out.println();
            
            int value = a;
          
            for(int j = 0; j < n; j++)
            {
            		value += ((Math.pow(2, j)) * b);
            		System.out.print(value + " " + " \n");
            		
            }
        
        }
        in.close();
     
    }
}