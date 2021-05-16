/**
    File Name: ConwaysGameOfLife.java
       Author: Gowthaman Kuppuswamy
   
  Description: This program will create the game which kills and give birth to the cells in the matrix
 */

public class ConwaysGameOfLife 
{
	public int row = 20;
	public int column = 20;
	
/**
    Method Name: initializeMatrix
    Description: This method initialize all the cells in the array to zero
        Accepts:2D- Array
        Returns:2D- Array
 */
    public int[][] initializeMatrix(int matrix[][])
    {
    	for(int i=0; i<row;i++)
    	{
    		for(int j=0; j<column; j++)
    		{
    				matrix[i][j] = 0;
    		}
    	}
    	return matrix;
    	
    }
    
 /**
    Method Name:killBoundaries
    Description:This method converts all the boundary values to zero
        Accepts:2D- Array
        Returns:2D- Array
 */		
    public int[][] killBoundaries(int matrix[][])
    {
    	for(int i=0; i<row;i++)
    	{
    		for(int j=0; j<column; j++)
    		{
    		if(i==0||i==19||j==0||j==19)
    			{
    				matrix[i][j] = 0;
    			}
    		}
    	}
    	return matrix;
    }
    
 /**
    Method Name:GameRules
    Description:This method will create a game with the following rules
   1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
   2. Any live cell with more than three live neighbors dies, as if by overcrowding.
   3. Any live cell with two or three live neighbors lives on to the next generation.
   4. Any dead cell with exactly three live neighbors becomes a live cell.

        Accepts:2D- Array
        Returns:2D- Array
 */	
    public int[][] GameRules(int matrix[][])
    {
    	int [][] newMatrix = new int[row][column]; 
    	for(int i=1; i<row-1 ;i++)
    	{
    		for(int j=1; j<column-1; j++)
    		{
    			int liveNeighbours = 0;
    			for(int x=-1; x<=1; x++)
    			{
   					for(int y=-1; y<=1 ; y++)
   					{
   						liveNeighbours += matrix[i+x][j+y];	
   					}
   				}
    			liveNeighbours -=matrix[i][j]; 
    			//live cell dies if it has less than two neighbors
    			if( (matrix[i][j] ==1 ) && (liveNeighbours<2))
    			{
   					newMatrix[i][j] = 0;	
   				} 
    			//live cell dies if has more than three neighbors
    			else if( (matrix[i][j] ==1 ) && (liveNeighbours>3))
 				{
    				newMatrix[i][j] = 0;	
 				}
    			//cell will be born if it is dead and has three neighbors
    		    else if( (matrix[i][j] ==0 ) && (liveNeighbours==3))
    			{
    				newMatrix[i][j] = 1;	
    			}
    			//live cell will survive if it has two or three neighbors
    			else
    			{
    				newMatrix[i][j] = matrix[i][j];
    			}
    		}
    	}
    	return newMatrix;
    }
    
    /**
    Method Name:printMatrix
    Description:This method converts all the boundary values to zero
        Accepts:2D- Array
        Returns:2D- Array
    */		
    public char[][] printMatrix(int matrix[][])
    { 
    	char[][] newMatrix = new char[row][column]; 
    	for(int i = 0 ; i<row; i++)
	    {
    		for(int j=0 ; j<column ; j++)
    		{
    			newMatrix[i][j] = 0;
    		}
	    }
    	for(int i=0; i<row;i++)
    	{
    		for(int j=0; j<column; j++)
    		{
    			if(matrix[i][j]==0) 
    			{
    				System.out.print(".");
    				newMatrix[i][j] = '.';			
    			}
    			else
    			{
    				System.out.print("*");
    				newMatrix[i][j] = '*';
    			}
    		}
    		 System.out.println(); 
    	}
    	return newMatrix;
    }
    
}