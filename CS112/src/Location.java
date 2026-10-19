
public class Location {
	protected double x;
	protected double y;
	protected String name;

	public Location() {
		this.x = 4.0;
		this.y = 7.0;
		this.name = "Solar";
	} 

	public Location(double x, double y, String n) {
		this.x = x;
		this.y = y;
		this.name = n;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getName() {
		return name;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void print() {
		System.out.println(toString());
	}

	public String toString() { // change to tostring method
		String phrase = String.format("Name: %s, Coordinates:(%f,%f)", name, x, y);
		return phrase;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location test = new Location(3, 4, "Classroom");
		System.out.println(test.getX());
		System.out.println(test.toString());

	}

}
