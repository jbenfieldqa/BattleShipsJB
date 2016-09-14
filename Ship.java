import java.util.ArrayList;


public class Ship {
	
	private String name;
	int ShipSize;
	ArrayList<Integer> ShipSpaces = new ArrayList<Integer>();
	ArrayList<Integer> ShipPos = new ArrayList<Integer>();
	ArrayList<Integer> ShipPosHit = new ArrayList<Integer>();
	int pos1;
	int pos2;
	int ShipHealth;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShipSize() {
		return ShipSize;
	}
	public ArrayList<Integer> getShipPos() {
		return ShipPos;
	}
	public void setShipPos(ArrayList<Integer> shipPos) {
		ShipPos = shipPos;
	}
	public int getPos1() {
		return pos1;
	}
	public void setPos1(int pos1) {
		this.pos1 = pos1;
	}
	public int getPos2() {
		return pos2;
	}
	
	public void setPos2(int pos2) {
		this.pos2 = pos2;
	}
	
	public void setShipSize(int shipSize) {
		ShipSize = shipSize;
	}
	
	public ArrayList<Integer> getShipSpaces() {
		return ShipSpaces;
	}
	public void setShipSpaces(ArrayList<Integer> shipSpaces) {
		ShipSpaces = shipSpaces;
	}
	public Ship(String name, int shipSize, int pos1, int pos2)
	{
		this.name = name;
		this.ShipSize = shipSize;
		this.pos1 = pos1;
		this.pos2 = pos2;
		this.ShipPos.add(pos1);
		this.ShipPos.add(pos2);
		this.ShipHealth = shipSize;
		for (int i = 0; i < shipSize; i++)
		{
			this.ShipSpaces.add(i);
		}
		
		
		
		// TODO Auto-generated constructor stub
	}
	

}
