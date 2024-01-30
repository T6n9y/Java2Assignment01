package GroupAssignment;

public class Triangle extends GeometricObject{

	private double side1, side2, side3 = 1.0;
	
	
	public Triangle() {
		
	}
	//CONSTRUCTOR THAT CREATES A NEW TRIANGLE IN THE MAIN BODY WHEN CALLED.
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public String toString() {
		return String.format("Sides of the triangle:\n" +
	            "   Side 1: %.2f\n" +
	            "   Side 2: %.2f\n" +
	            "   Side 3: %.2f\n" +
	            "Area of the triangle: %.2f\n" +
	            "Perimeter of the triangle: %.2f\n" +
	            "Color of the triangle: %s\n" +
	            "Filled or not: %s\n",
	            getSide1(), getSide2(), getSide3(),
	            getArea(), getPerimeter(), getColor(), getFilled() != null ? getFilled() ? "Yes" : "No" : "Not specified");
	}
	

	@Override
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s*(s - side1)* (s - side2)* (s-side3));
		
	}

	@Override
	public double getPerimeter() {
		return (side1 + side2 + side3)/2;
		
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	

}
