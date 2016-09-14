
public class Main {

	public Main() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Grid grid = new Grid();
		Grid grid2 = new Grid();
		Ship ship1 = new Ship("Ship1",2,1,2);//name,size,pos1,pos2;
		Ship ship2 = new Ship("Ship2",2,6,9);
		
		// TODO Auto-generated method stub
		grid.printGrid();
		System.out.println(ship1.getShipPos());
		System.out.println(ship1.getName()+ " has a size of "+ ship1.ShipSpaces.size());
		System.out.println("the grid size is " + grid.arrayGrid.length);
		System.out.println(ship1.getName()+ "is in postiion" + ship1.getShipPos());
		
		System.out.println("\n" + "-------------------" + "\n");
		
		checkShipPos(grid,ship1);
		checkShipPos(grid2,ship2);
		shipFire(ship1, ship2,6);
		shipFire(ship2, ship1,3);
		shipFire(ship1, ship2,6);
		shipFire(ship2, ship1,2);
		shipFire(ship1, ship2,7);
		shipFire(ship1, ship2, 9);
		
		
		// add players
		// add scanner for player in puts
		// add loop that switches player and allows them input a position to fire at	
	}
	public static void checkShipPos(Grid grid, Ship ship)
	{
		//method that check the position of the ship object on the grid
		int i;
		int x;
		int iStored = 0;
		int xStored = 0;
		for (i = 0; i < grid.arrayGrid.length; i++)
		{
			for ( x = 0; x < grid.arrayGrid.length;x++)
			{
				if (grid.arrayGrid[i][x] == ship.pos1 || grid.arrayGrid[i][x] == ship.pos2)// checks to see if array element value is equal to the position of the ship
				{	
					//System.out.println(grid.arrayGrid[i][x] + " pass" + " " + i +""+ x);
					if(grid.arrayGrid[i][x] == ship.pos1)
					{
						iStored = grid.arrayGrid[i][x]; // if the value is equal to the position, the value is stored
					}
					else if (grid.arrayGrid[i][x] == ship.pos2)
					{
						xStored = grid.arrayGrid[i][x];// if the value is equal to the position, the value is stored
					}
				}
				//else System.out.println(grid.arrayGrid[i][x] + " fail" + " " + i +""+ x);
			}					
		}
		System.out.println (ship.getName() + " is positioned at " + iStored + " " + xStored);
	}
	public static void shipFire(Ship attShip, Ship hitShip, int posHit)
	{

		if (posHit == hitShip.pos1 || posHit == hitShip.pos2)//check to see if the point fire at is equal to any ships ships positions
		{
			if (hitShip.ShipPosHit.size() == 0)//check to see if the ship has been hit before, ships have two points
			{
				hitShip.ShipPosHit.add(posHit);
				hitShip.ShipHealth--;
				System.out.println(attShip.getName() + " fired and hit " + hitShip.getName()); //if the ship hasn't been hit before the, the hit is successful
			}
			else if (hitShip.ShipPosHit.size() > 0)// if the ship has been hit before
			{
				if(posHit != hitShip.ShipPosHit.get(0) ) // checks to see if the same point has been hit
				{
					hitShip.ShipPosHit.add(posHit);
					hitShip.ShipHealth--;
					System.out.println(attShip.getName() + " fired and hit " + hitShip.getName());
				}
				else if (posHit == hitShip.ShipPosHit.get(0)) // if the same point has been hit
				{
					System.out.println(attShip.getName() + " has already hit this point on " + hitShip.getName());
				}
			}		
		}
		else if (posHit != hitShip.pos1 || posHit != hitShip.pos2)
		{
			System.out.println(attShip.getName() + " fired and misses " + hitShip.getName());
		}
		else if (posHit != attShip.pos1 || posHit != attShip.pos2)
		{
			System.out.println(attShip.getName() + " can't hit its self");
		}
		checkIsDead(hitShip);
		//System.out.println(hitShip.ShipPosHit.size());
		//System.out.println(hitShip.ShipPosHit.get(0));

	}
	public static boolean checkIsDead(Ship ship)
	{
		if(ship.ShipHealth == 0)
		{
			System.out.println(ship.getName() + " has Sunk ");
			return true;
		}
		else return false;
	}
}
