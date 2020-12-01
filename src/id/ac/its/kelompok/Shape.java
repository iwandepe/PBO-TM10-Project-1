package id.ac.its.kelompok;

public abstract class Shape {

	protected String color;
	
	// default constructor
	public Shape() {
		super();
//		System.out.println("[Shape]: Default Constructor");
	}
	
	public abstract double getArea();
	
	public abstract double getAround();
	
	public void draw() {
		System.out.println("Drawing shape");
	}
	
}


