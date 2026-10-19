
public class Building extends Location {

	public Building(int x, int y, String n, double area, int f) {
		super(x, y, n);
		this.areaofFloorPlan = area;
		this.numOfFloors = f;
		// TODO Auto-generated constructor stub
	}

	private double areaofFloorPlan;
	private int numOfFloors;

	public double getArea() {
		return areaofFloorPlan;
	}

	public int getFloors() {
		return numOfFloors;
	}

	public void setFloors(int n) {
		this.numOfFloors = n;
	}

	public void setArea(double area) {
		this.areaofFloorPlan = area;
	}

	public Building() { // Calling the default constructor in Location
		
	}

	public static void print(Building b) {//Changing this to static means I would have to pass in the specific object id want to print.
		System.out.println(b.toString());
	}

	public void print() {
		System.out.println("Name: " + name + " Location: (" + x + "," + y + ")");

	}

	@Override
	public String toString() { // change to tostring method
		return String.format("Number of floors: %d  \nArea of floor plan: %.2f m^2", numOfFloors, areaofFloorPlan); //For doubles.. to limit the number of decimal places used add a point and a number before the keyletter
	}

	public boolean equals(Building other) {
		return this.getFloors() == other.getFloors() && this.getX() == other.getX() && this.getY() == other.getY();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
