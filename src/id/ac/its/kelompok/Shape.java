package id.ac.its.kelompok;

public class Shape {

	protected String color;
	
	// default constructor
	public Shape() {
		super();
		System.out.println("[Shape]: Default Constructor");
	}
	
	public double getArea() {
		return 0.0;
	}
	
	public double getAround() {
		return 0.0;
	}
	
	public void draw() {
		System.out.println("Drawing shape");
	}
	
}
