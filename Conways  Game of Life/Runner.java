/**
    Class Name: Runner
       Author: Gowthaman Kuppuswamy
         Date: April 5, 2017 5:22:45 PM
  Description: This method will get input from the user and will call methods in the ConwaysGameOfLife Class.
 */
import java.util.Scanner;

public class Runner 
{	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		int row = 20;
		int column = 20; 
		boolean flag = true;
		int [][] saveResult = new int[row][column];
		int [][] matrix = new int[row][column];
		
		ConwaysGameOfLife object1 = new ConwaysGameOfLife();
		
		saveResult=object1.initializeMatrix(saveResult);
		matrix = object1.initializeMatrix(matrix);
		for(int i =0; i<10;i++)
		{
		
			System.out.print("Please enter yes to start the game: ");
			String myString = input.next();
			char data = myString.charAt(0);
			if((data == 'Y')||( data == 'y'))
			{
				while(flag!= false)
				{
					System.out.println("Enter the row and to exit at any point press -1. Please enter a value from 0 to 19 "); 
					int rowNumber = input.nextInt();
					if(rowNumber == -1)
					{
						flag = false;  
						break;
					}
					System.out.println("Enter the column and to exit at any point press -1.Please enter a value from 0 to 19"); 
					int columnNumber = input.nextInt();
					if(columnNumber == -1)
					{
						flag = false;  
						break;
					}
					matrix[rowNumber][columnNumber] = 1;	
				}
			}  

			System.out.println("\n Original Matrix:");
			matrix = object1.killBoundaries(matrix);
			object1.printMatrix(matrix); 
	    
			saveResult = object1.killBoundaries(matrix);
			saveResult = object1.GameRules(saveResult);
	    
			System.out.println("\n Next Generation");
			object1.printMatrix(saveResult); 
	    //System.out.print("\033[H\033[2J");
	    //System.out.flush();  
		}
	}
}
