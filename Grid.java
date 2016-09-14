
public class Grid {
	
	int [][] arrayGrid = new int [3][3];

	
	public Grid() 
	{	
		
		arrayGrid[0][0] = 1;
		arrayGrid[0][1] = 2;
		arrayGrid[0][2] = 3;
		arrayGrid[1][0] = 4;
		arrayGrid[1][1] = 5;
		arrayGrid[1][2] = 6;
		arrayGrid[2][0] = 7;
		arrayGrid[2][1] = 8;
		arrayGrid[2][2] = 9;
		
		// TODO Auto-generated constructor stub
	}
	
	public int[][] getArrayGrid(int i, int x) {
		return arrayGrid;
	}

	public void setArrayGrid(int[][] arrayGrid) {
		this.arrayGrid = arrayGrid;
	}

	public void printGrid()
	{
		int rows = 3;
		int columns = 3;
		int i,j;
		for (i = 0; i<rows; i++)
		{
			for (j=0; j<columns; j++)
			{
				System.out.print(arrayGrid[i][j] + "");
			}
			System.out.println("");
		}
		
	}

	
}
