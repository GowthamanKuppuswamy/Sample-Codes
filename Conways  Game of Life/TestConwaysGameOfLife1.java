/**
   Class Name:TestConwaysOfLife1
       Author: Gowthaman Kuppuswamy
         Date: April 3, 2017 5:22:45 PM
  Description: This method will get input from the user and will call methods in the ConwaysGameOfLife Class.
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class TestConwaysGameOfLife1 
{
     
   public int row = 20;
   public int column = 20;
   
	
/**
   Test Name: Test001initializeMatrix
   Description: This will test whether all the values in the array are initialized to zero or not
       Accepts:2D- Array
       Returns: None
*/
   @Test
   public void Test001initializeMatrix()
   {
       boolean flag = false;
       int counter = 0;
       int [][] resultArray = new int[row][column];
       int [][] testArray = new int[row][column];
       for(int i = 0 ; i<row; i++)
       {
		  for(int j=0 ; j<column ; j++)
		  {
			  testArray[i][j] = 0;
			  resultArray[i][j] = 0;
		  }
       }
	  testArray[0][0]=1;
	  testArray[2][5]=1;
	  testArray[5][11]=1;
	  testArray[19][8 ]=1;
	  ConwaysGameOfLife object3= new ConwaysGameOfLife();
	  resultArray = object3.initializeMatrix(testArray);
	  for(int i = 0 ; i<row; i++)
	  {
		  for(int j=0 ; j<column ; j++)
		  {
			  counter = counter + resultArray[i][j];				
		  }
	  }
	  if(counter == 0)
	  {
		 flag =true;
	  }
	  assertTrue(flag);
}

 /**
   Test Name  :Test002KillLiveCellwithNoNeighbour
   Description: This will test whether the live cell with no neighbor dies or not
       Accepts:2D- Array
       Returns:None
*/  
   @Test
   public void Test002KillLiveCellwithNoNeighbour()
   {
	   boolean flag = false;
	   int [][] resultArray = new int[row][column];
   	 	int [][] testArray = new int[row][column];     
   	 	for(int i = 0 ; i<row; i++)
   	 	{
   	 		for(int j=0 ; j<column ; j++)
   	 		{
   	 			testArray[i][j] = 0;
   	 			resultArray[i][j] = 0;
   	 		}
   	 	}
   	 	testArray[7][8]=1;
   	 	ConwaysGameOfLife object4 = new ConwaysGameOfLife();
   	 	resultArray = object4.GameRules(testArray);
   	 	if(resultArray[7][8] == 0)
   	 	{
   	 		flag =true;
   	 	}
   	 	assertTrue(flag);
    }
   

   /**
     Test Name  :Test003KillLiveCellwithOneNeighbour
     Description: This will test whether the live cell with one neighbor dies or not
         Accepts:2D- Array
         Returns:None
  */  
    @Test
    public void Test003KillLiveCellwithOneNeighbour()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
    	int [][] testArray = new int[row][column];
		  for(int i = 0 ; i<row; i++)
		  {
			  for(int j=0 ; j<column ; j++)
			  {
				  testArray[i][j] = 0;
				  resultArray[i][j] = 0;
			  }
		  }
		  testArray[7][8]=1;
		  testArray[7][9]=1;  
		  ConwaysGameOfLife object5 = new ConwaysGameOfLife();
	      resultArray = object5.GameRules(testArray);
    	 if(resultArray[7][8] == 0)
    	 {
    		 flag =true;
    	 }
    	 assertTrue(flag);
    }
    
    /**
    Test Name  :Test004LiveCellSurvivalwithTwoNeighbours
    Description: This will test whether the a live cell survives or not if it is surrounded by four neighbors
        Accepts:2D- Array
        Returns:None
*/ 
        
@Test
public void Test004LiveCellSurvivalwithTwoNeighbours()
{
    boolean flag = false;
    int [][] resultArray = new int[row][column];
    int [][] testArray = new int[row][column];
    for(int i = 0 ; i<row; i++)
    {
    	for(int j=0 ; j<column ; j++)
    	{
    		testArray[i][j] = 0;
    		resultArray[i][j] = 0;
    	}
    }
    testArray[7][8]=1;
    testArray[7][9]=1;  
    testArray[7][7]=1;
    ConwaysGameOfLife object6= new ConwaysGameOfLife();
    resultArray = object6.GameRules(testArray);
    if(resultArray[7][8] == 1)
    {
    	flag =true;
    }
    assertTrue(flag); 
}
/**
Test Name  : Test005LiveCellSurvivalwithThreeNeighbours
Description: This will test whether the a live cell survives or not if it is surrounded by three neighbors
    Accepts:2D- Array
    Returns:None
*/ 

@Test
public void  Test005LiveCellSurvivalwithThreeNeighbours()
{
    boolean flag = false;
    int [][] resultArray = new int[row][column];
    int [][] testArray = new int[row][column];
    for(int i = 0 ; i<row; i++)
    {
    	for(int j=0 ; j<column ; j++)
    	{
    		testArray[i][j] = 0;
    		resultArray[i][j] = 0;
    	}
    }
    testArray[7][8]=1;
    testArray[7][9]=1;  
    testArray[7][7]=1;
    testArray[6][8]=1;
    ConwaysGameOfLife object7= new ConwaysGameOfLife();
    resultArray = object7.GameRules(testArray);
    if(resultArray[7][8] == 1)
    {
    	flag =true;
    }
    assertTrue(flag);

}

/**
    Test Name  :Test006KillOverPopulatedCellwithFourNeighbours
    Description: This will test whether the live cell with four neighbors dies or not
        Accepts:2D- Array
        Returns:None
*/ 
    @Test
    public void Test006KillOverPopulatedCellwithFourNeighbours()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
    	int [][] testArray = new int[row][column];
		for(int i = 0 ; i<row; i++)
		{
		  for(int j=0 ; j<column ; j++)
		  {
			  testArray[i][j] = 0;
			  resultArray[i][j] = 0;
		  }
		  }
		  testArray[7][8]=1;
		  testArray[7][9]=1;  
		  testArray[7][7]=1;
		  testArray[6][8]=1;
		  testArray[6][7]=1;
		  ConwaysGameOfLife object8= new ConwaysGameOfLife();
	      resultArray = object8.GameRules(testArray);
    	 if(resultArray[7][8] == 0)
    	 {
    		 flag =true;
    	 }
    	 assertTrue(flag);
    }
    
 /**
    Test Name  :Test007KillOverPopulatedCellwithFiveNeighbours
    Description: This will test whether the live cell with five neighbors dies or not
        Accepts:2D- Array
        Returns:None
*/
    
    @Test
    public void Test007KillOverPopulatedCellwithFiveNeighbours()
    {
    	boolean flag = false;
        int [][] resultArray = new int[row][column];
    	int [][] testArray = new int[row][column];
		for(int i = 0 ; i<row; i++)
		{
		  for(int j=0 ; j<column ; j++)
		  {
			  testArray[i][j] = 0;
			  resultArray[i][j] = 0;
		  }
		}
		testArray[7][8]=1;
		testArray[7][9]=1;  
		testArray[7][7]=1;
		testArray[6][8]=1;
		testArray[6][7]=1;
		testArray[6][9]=1;
		ConwaysGameOfLife object9= new ConwaysGameOfLife();
	    resultArray = object9.GameRules(testArray);
	    if(resultArray[7][8] == 0)
    	{
    		flag =true;
    	}
    	assertTrue(flag);
    }
    
   

 /**
    Test Name  :Test008KillOverPopulatedCellwithSixNeighbours
    Description: This will test whether the live cell with six neighbors dies or not
        Accepts:2D- Array
        Returns:None
*/
    
    @Test
    public void Test008KillOverPopulatedCellwithSixNeighbours()
    {
    	boolean flag = false;
        int [][] resultArray = new int[row][column];
    	int [][] testArray = new int[row][column];
		for(int i = 0 ; i<row; i++)
		{
		  for(int j=0 ; j<column ; j++)
		  {
			  testArray[i][j] = 0;
			  resultArray[i][j] = 0;
		  }
		}
		testArray[7][8]=1;
		testArray[7][9]=1;  
		testArray[7][7]=1;
		testArray[6][8]=1;
		testArray[6][7]=1;
		testArray[6][9]=1;
		testArray[8][7]=1;
		ConwaysGameOfLife object10= new ConwaysGameOfLife();
	    resultArray = object10.GameRules(testArray);
	    if(resultArray[7][8] == 0)
    	{
    		flag =true;
    	}
    	assertTrue(flag);
    }

    /**
    Test Name  :Test009KillOverPopulatedCellwithSevenNeighbours
    Description: This will test whether the live cell with seven neighbors dies or not
        Accepts:2D- Array
        Returns:None
*/
    
    @Test
    public void Test009KillOverPopulatedCellwithSevenNeighbours()
    {
    	boolean flag = false;
        int [][] resultArray = new int[row][column];
    	int [][] testArray = new int[row][column];
		for(int i = 0 ; i<row; i++)
		{
		  for(int j=0 ; j<column ; j++)
		  {
			  testArray[i][j] = 0;
			  resultArray[i][j] = 0;
		  }
		}
		testArray[7][8]=1;
		testArray[7][9]=1;  
		testArray[7][7]=1;
		testArray[6][8]=1;
		testArray[6][7]=1;
		testArray[6][9]=1;
		testArray[8][7]=1;
		testArray[8][8]=1;
		ConwaysGameOfLife object11= new ConwaysGameOfLife();
	    resultArray = object11.GameRules(testArray);
	    if(resultArray[7][8] == 0)
    	{
    		flag =true;
    	}
    	assertTrue(flag);
    }
    
    /**
    Test Name  :Test0010KillOverPopulatedCellwithEightNeighbours
    Description: This will test whether the live cell with eight neighbors dies or not
        Accepts:2D- Array
        Returns:None
*/
    
    @Test
    public void Test010KillOverPopulatedCellwithEightNeighbours()
    {
    	boolean flag = false;
        int [][] resultArray = new int[row][column];
    	int [][] testArray = new int[row][column];
		for(int i = 0 ; i<row; i++)
		{
		  for(int j=0 ; j<column ; j++)
		  {
			  testArray[i][j] = 0;
			  resultArray[i][j] = 0;
		  }
		}
		testArray[7][8]=1;
		testArray[7][9]=1;  
		testArray[7][7]=1;
		testArray[6][8]=1;
		testArray[6][7]=1;
		testArray[6][9]=1;
		testArray[8][7]=1;
		testArray[8][8]=1;
		testArray[8][9]=1;
		ConwaysGameOfLife object12= new ConwaysGameOfLife();
	    resultArray = object12.GameRules(testArray);
	    if(resultArray[7][8] == 0)
    	{
    		flag =true;
    	}
    	assertTrue(flag);
    }
    
/**
    Test Name  :Test011NoCellBirthwithNoNeighbour
    Description:This will test whether the no cell has been born or not if it is surrounded by no neighbor
        Accepts:2D- Array
        Returns:None
*/
    
    @Test
    public void Test011NoCellBirthwithNoNeighbour()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[7][8]=0;
        testArray[7][9]=0;  
        ConwaysGameOfLife object13= new ConwaysGameOfLife();
        resultArray = object13.GameRules(testArray);
        if(resultArray[7][8] == 0)
        {
        	flag =true;
        }
        assertTrue(flag);
    }
     
/**
    Test Name  :Test012NoCellBirthwithOneNeighbour
    Description:This will test whether the no cell has been born or not if it is surrounded by one neighbor
        Accepts:2D- Array
        Returns:None
*/
    @Test
    public void Test012NoCellBirthwithOneNeighbour()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[7][8]=0;
        testArray[7][9]=1;  
        ConwaysGameOfLife object14= new ConwaysGameOfLife();
        resultArray = object14.GameRules(testArray);
        if(resultArray[7][8] == 0)
        {
		 flag =true;
        }
        assertTrue(flag); 
    }
    
/**
    Test Name  :Test013tNoCellBirthwithTwoNeighbours
    Description:This will test whether the no cell has been born or not if it is surrounded by two neighbors.
        Accepts:2D- Array
        Returns:None
*/ 
    @Test
    public void Test013tNoCellBirthwithTwoNeighbours()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}	
        }
        testArray[7][8]=0;
        testArray[7][7]=1;  
        testArray[7][9]=1;  
        ConwaysGameOfLife object15= new ConwaysGameOfLife();
        resultArray = object15.GameRules(testArray);
        if(resultArray[7][8] == 0)
        {
        	flag =true;
        }
        assertTrue(flag); 
    }
    
/**
    Test Name  :Test014NewCellBirthwithThreeNeighbours
    Description:This will test whether the a cell has been born or not if it is surrounded by three neighbors
        Accepts:2D- Array
        Returns:None
*/ 
    
	@Test
    public void Test014NewCellBirthwithThreeNeighbours()
    {
		boolean flag = false;
		int [][] resultArray = new int[row][column];
		int [][] testArray = new int[row][column];
		for(int i = 0 ; i<row; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
				testArray[i][j] = 0;
				resultArray[i][j] = 0;
			}
		}
		testArray[7][8]=0;
		testArray[7][9]=1;  
		testArray[7][7]=1;
		testArray[6][8]=1;
		ConwaysGameOfLife object16= new ConwaysGameOfLife();
		resultArray = object16.GameRules(testArray);
		if(resultArray[7][8] == 1)
		{
			flag =true;
		}
		assertTrue(flag);
    }
/**
    Test Name  :Test015NoCellBirthwithFourNeighbours
    Description: This will test whether the no cell has been born or not if it is surrounded by four neighbors
        Accepts:2D- Array
        Returns:None
*/ 
     
    @Test
    public void Test015NoCellBirthwithFourNeighbours()
    {
    	boolean flag = false;
    	int [][] resultArray = new int[row][column];
    	int [][] testArray = new int[row][column];
    	for(int i = 0 ; i<row; i++)
    	{
    		for(int j=0 ; j<column ; j++)
    		{
    			testArray[i][j] = 0;
    			resultArray[i][j] = 0;
    		}	
    	}
    	testArray[7][8]=0;
    	testArray[6][7]=1;  
    	testArray[6][9]=1;
    	testArray[7][7]=1;  
    	testArray[7][9]=1; 
    	ConwaysGameOfLife object17= new ConwaysGameOfLife();
    	resultArray = object17.GameRules(testArray);
    	if(resultArray[7][8] == 0)
    	{
    		flag =true;
    	}
    	assertTrue(flag);
 
    }
   
/**
    Test Name  : Test016NoCellBirthwithFiveNeighbours
    Description: This will test whether the no cell has been born or not if it is surrounded by five neighbors
        Accepts:2D- Array
        Returns:None
*/ 
         
    @Test
    public void Test016NoCellBirthwithFiveNeighbours()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[7][8]=0;
        testArray[6][7]=1;  
        testArray[6][8]=1;
        testArray[6][9]=1;  
        testArray[7][7]=1;  
        testArray[7][9]=1;  
        ConwaysGameOfLife object18= new ConwaysGameOfLife();
        resultArray = object18.GameRules(testArray);
        if(resultArray[7][8] == 0)
        {
        	flag =true;
        }
        assertTrue(flag);
    }
    
/**
    Test Name  : Test017NoCellBirthwithSixNeighbours
    Description: This will test whether the no cell has been born or not if it is surrounded by six neighbors
        Accepts:2D- Array
        Returns:None
*/ 
         
    @Test
    public void Test017NoCellBirthwithFiveNeighbours()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[7][8]=0;
        testArray[6][7]=1;  
        testArray[6][8]=1;
        testArray[6][9]=1;  
        testArray[7][7]=1;  
        testArray[7][9]=1; 
        testArray[8][7]=1; 
        ConwaysGameOfLife object19= new ConwaysGameOfLife();
        resultArray = object19.GameRules(testArray);
        if(resultArray[7][8] == 0)
        {
        	flag =true;
        }
        assertTrue(flag);
    }
    
/**
    Test Name  : Test018NoCellBirthwithSevenNeighbours
    Description: This will test whether the no cell has been born or not if it is surrounded by Seven neighbors
        Accepts:2D- Array
        Returns:None
*/ 
         
    @Test
    public void Test018NoCellBirthwithSevenNeighbours()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[7][8]=0;
        testArray[6][7]=1;  
        testArray[6][8]=1;
        testArray[6][9]=1;  
        testArray[7][7]=1;  
        testArray[7][9]=1;  
        testArray[8][7]=1;
        testArray[8][8]=1;  
        ConwaysGameOfLife object20= new ConwaysGameOfLife();
        resultArray = object20.GameRules(testArray);
        if(resultArray[7][8] == 0)
        {
        	flag =true;
        }
        assertTrue(flag);
    }

 /**
    Test Name  : Test019NoCellBirthwithEightNeighbours
    Description: This will test whether the no cell has been born or not if it is surrounded by eight neighbors
        Accepts:2D- Array
        Returns:None
*/ 
         
    @Test
    public void Test019NoCellBirthwithEightNeighbours()
    {
        boolean flag = false;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[7][8]=0;
        testArray[6][7]=1;  
        testArray[6][8]=1;
        testArray[6][9]=1;  
        testArray[7][7]=1;  
        testArray[7][9]=1; 
        testArray[8][7]=1;  
        testArray[8][8]=1;  
        testArray[8][9]=1;  
        ConwaysGameOfLife object21= new ConwaysGameOfLife();
        resultArray = object21.GameRules(testArray);
        if(resultArray[7][8] == 0)
        {
        	flag =true;
        }
        assertTrue(flag);
    }
    
    

/**
    Test Name  : Test020NoNewBirthofDeadBoundaryCells
    Description: This will test whether the dead cells on the boundary remains dead or not after boundaries has been killed.
        Accepts:2D- Array
        Returns:None
*/ 
	
	@Test
    public void Test020NoNewBirthofDeadBoundaryCells()
    {
        boolean flag = false;
        int counter =0;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {	
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[0][0]=0;
        testArray[2][19]=0;
        testArray[19][5]=0;
        testArray[19][8 ]=0;
        ConwaysGameOfLife object22= new ConwaysGameOfLife();
        resultArray = object22.killBoundaries(testArray);
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
				if(i==0||i==19||j==0||j==19)
				{
					counter = counter + resultArray[i][j];
				}
        	}
        }
        if(counter == 0)
        {
        	flag =true;
        }
        assertTrue(flag);
    }
	
 /**
    Test Name  :Test021KillLiveBoundaryCells
    Description:This will test whether the live cells on the boundary  are killed or not after all boundaries has been killed
        Accepts:2D- Array
        Returns:None
*/ 
	

	@Test
    public void Test021KillLiveBoundaryCells()
    {
        boolean flag = false;
        int counter =0;
        int [][] resultArray = new int[row][column];
        int [][] testArray = new int[row][column];
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		testArray[i][j] = 0;
        		resultArray[i][j] = 0;
        	}
        }
        testArray[0][0]=1;
        testArray[2][19]=1;
        testArray[19][5]=1;
        testArray[19][8 ]=1;
        ConwaysGameOfLife object23= new ConwaysGameOfLife();
        resultArray = object23.killBoundaries(testArray);
        for(int i = 0 ; i<row; i++)
        {
        	for(int j=0 ; j<column ; j++)
        	{
        		if(i==0||i==19||j==0||j==19)
        		{
        			counter = counter + resultArray[i][j];
        		}
        	}
        }
        if(counter == 0)
        {
        	flag =true;
        }
        assertTrue(flag); 
    }

/**
    Test Name  :Test022printMatrix
    Description: This will ensure that the matrix is printed correctly or not
        Accepts:2D- Array
        Returns:None
*/ 
	
	@Test
	   public void Test022printMatrix()
	   {
	       boolean flag = false;
	       char [][] resultArray = new char[row][column];
	       int [][] testArray = new int[row][column];
	       for(int i = 0 ; i<row; i++)
	       {
			  for(int j=0 ; j<column ; j++)
			  {
				  testArray[i][j] = 0;
				  resultArray[i][j] = 0;
			  }
	       }
	       testArray[2][5]=0;
	       testArray[7][18]=1;
	       ConwaysGameOfLife object24= new ConwaysGameOfLife();
	       resultArray = object24.printMatrix(testArray);	
	       if((resultArray[2][5]=='.')&&(resultArray[7][18] == '*'))
	       {
	    	   flag =true;
	       }
	       assertTrue(flag);
	   }

}


